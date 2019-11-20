package concilio.config.routing;

import concilio.entity.local.LocalCandidate;
import concilio.entity.vinc.Candidate;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;
import concilio.entity.vinc.AccountantEmail;

import javax.persistence.Entity;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.EnumSet;

@Component("vincereRoutingTestUtil")
@PropertySource("classpath:application-datasources-local.properties")
public class LocalRoutingTestUtil {

    public void createDatabase(String url, String username, String password, String dialect) throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);

        MetadataSources metadata = new MetadataSources(
            new StandardServiceRegistryBuilder()
                .applySetting("hibernate.dialect",dialect)
                .applySetting("javax.persistence.schema-generation-connection", connection)
                .applySetting(Environment.HBM2DDL_AUTO, "update").build());

        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);
        scanner.addIncludeFilter(new AnnotationTypeFilter(Entity.class));

        // Only create candidate table
        /* for (BeanDefinition def : scanner.findCandidateComponents(AccountantEmail.class.getPackage().getName())) {
            metadata.addAnnotatedClass(Class.forName(def.getBeanClassName()));
        }*/
        metadata.addAnnotatedClass(LocalCandidate.class);

        Metadata mtd = metadata.buildMetadata();

        File tempFile = null;
        tempFile = new File("target/dbscript/vincere_schema.sql");
        new SchemaExport()
                .setOutputFile(tempFile.getAbsolutePath())
                .setFormat(false)
                .createOnly(EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT), mtd);

//        SchemaExport export = new SchemaExport((MetadataImplementor) metadata.buildMetadata(), connection);
//        export.create(true, true);
    }
}
