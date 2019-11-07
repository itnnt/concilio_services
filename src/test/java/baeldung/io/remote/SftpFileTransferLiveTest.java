package baeldung.io.remote;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.VFS;
import org.junit.Test;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.sftp.SFTPClient;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SftpFileTransferLiveTest {
    Logger logger = LoggerFactory.getLogger(SftpFileTransferLiveTest.class);

    private String remoteHost = "test.rebex.net";
    private String username = "demo";
    private String password = "password";
    private String localFile = "/src/main/resources/uploadfiles/upload.txt";
    private String remoteFile = "readme.txt";
    private String localDir = "target/ftpremotefiles/";
    private String remoteDir = "/pub/example/";
    private String knownHostsFileLoc = "/Users/USERNAME/known_hosts_sample";

//    @Test
    public void whenUploadFileUsingJsch_thenSuccess() throws JSchException, SftpException {
        ChannelSftp channelSftp = setupJsch();
        channelSftp.connect();
        channelSftp.put(localFile, remoteDir + "jschFile.txt");
        channelSftp.exit();
    }

//    @Test: fail
    public void whenDownloadFileUsingJsch_thenSuccess() throws JSchException, SftpException {
        ChannelSftp channelSftp = setupJsch();
        channelSftp.connect();
        channelSftp.get(remoteFile, localDir + "jschFile.txt");
        channelSftp.exit();
    }

//    @Test
    public void whenUploadFileUsingSshj_thenSuccess() throws IOException {
        SSHClient sshClient = setupSshj();
        SFTPClient sftpClient = sshClient.newSFTPClient();
        sftpClient.put(localFile, remoteDir + "sshjFile.txt");
        sftpClient.close();
        sshClient.disconnect();
    }

    @Test
    public void whenDownloadFileUsingSshj_thenSuccess() throws IOException {
        SSHClient sshClient = setupSshj();
        SFTPClient sftpClient = sshClient.newSFTPClient();
        sftpClient.get(remoteFile, localDir + "sshjFile.txt");
        sftpClient.close();
        sshClient.disconnect();
    }

//    @Test
    public void whenUploadFileUsingApacheVfs_thenSuccess() throws IOException {
        FileSystemManager manager = VFS.getManager();
        FileObject local = manager.resolveFile(System.getProperty("user.dir") + "/" + localFile);
        FileObject remote = manager.resolveFile("sftp://" + username + ":" + password + "@" + remoteHost + "/" + remoteDir + "vfsFile.txt");
        remote.copyFrom(local, Selectors.SELECT_SELF);
        local.close();
        remote.close();
    }

    @Test
    public void whenDownloadFileUsingApacheVfs_thenSuccess() throws IOException {
        FileSystemManager manager = VFS.getManager();
        FileObject local = manager.resolveFile(System.getProperty("user.dir") + "/" + localDir + "vfsFile.txt");
        FileObject remote = manager.resolveFile("sftp://" + username + ":" + password + "@" + remoteHost + "/" + remoteFile);
        local.copyFrom(remote, Selectors.SELECT_SELF);
        local.close();
        remote.close();
    }

    @Test
    public void whenListingFolderContentsUsingApacheFTPClient_thenSuccess() throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(remoteHost, 21);
        ftpClient.login(username, password);

        FTPFile[] ftpFiles = ftpClient.listFiles();

        for (FTPFile f: ftpFiles)
        {
            logger.info(f.getName());
        }
    }

    // ====== ssh-keyscan -H -t rsa remoteHost >> known_hosts_sample

    private ChannelSftp setupJsch() throws JSchException {
        JSch jsch = new JSch();
        jsch.setKnownHosts(knownHostsFileLoc);
        Session jschSession = jsch.getSession(username, remoteHost);
        jschSession.setPassword(password);
//        jschSession.setPort(21);
        //jschSession.setConfig("StrictHostKeyChecking", "no");
        jschSession.connect();
        return (ChannelSftp) jschSession.openChannel("sftp");
    }

    private SSHClient setupSshj() throws IOException {
        SSHClient client = new SSHClient();
        client.addHostKeyVerifier(new PromiscuousVerifier());
        client.connect(remoteHost);
        client.authPassword(username, password);
        return client;
    }

}