package de.chkal.rewrite.multipart;

import javax.servlet.ServletContext;

import org.ocpsoft.rewrite.annotation.RewriteConfiguration;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;

@RewriteConfiguration
public class UploadConfigProvider extends HttpConfigurationProvider
{

   @Override
   public Configuration getConfiguration(ServletContext context)
   {
      return ConfigurationBuilder.begin()

      // This breaks the upload
      // .addRule(Join.path("/upload").to("/upload.jsf"))

      ;
   }

   @Override
   public int priority()
   {
      return 0;
   }

}
