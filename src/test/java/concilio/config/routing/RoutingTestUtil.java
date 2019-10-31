package concilio.config.routing;

import concilio.model.customer.Customer;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.EnumSet;

import static org.hibernate.tool.schema.TargetType.DATABASE;
import static org.hibernate.tool.schema.TargetType.STDOUT;

@Component("routingTestUtil")
public class RoutingTestUtil {

    public void createDatabase(
        DatabaseEnvironment environment) throws Exception {

        Connection connection = DriverManager.getConnection(
                "jdbc:h2:file:./customer" + environment.name().toLowerCase()
                        + ";DB_CLOSE_DELAY=-1", "sa", "sa");

        MetadataSources metadata = new MetadataSources(
            new StandardServiceRegistryBuilder()
                .applySetting("hibernate.dialect","org.hibernate.dialect.H2Dialect")
                .applySetting("javax.persistence.schema-generation-connection", connection)
                .applySetting(Environment.HBM2DDL_AUTO, "update").build());

        ClassPathScanningCandidateComponentProvider scanner =
            new ClassPathScanningCandidateComponentProvider(true);
        scanner.addIncludeFilter(new AnnotationTypeFilter(Entity.class));

        for (BeanDefinition def : scanner
            .findCandidateComponents(Customer.class.getPackage().getName())) {
            metadata.addAnnotatedClass(Class.forName(def.getBeanClassName()));
        }

        Metadata mtd = metadata.buildMetadata();

        java.io.File tempFile = null;
        tempFile = new File("schema.sql");
        new SchemaExport()
                .setOutputFile(tempFile.getAbsolutePath())
                .setFormat(false)
                .createOnly(EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT), mtd);





//        SchemaExport export = new SchemaExport((MetadataImplementor) metadata.buildMetadata(), connection);
//        export.create(true, true);
    }
}
