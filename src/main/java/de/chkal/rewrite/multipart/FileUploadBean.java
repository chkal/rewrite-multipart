package de.chkal.rewrite.multipart;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

@ManagedBean
@RequestScoped
public class FileUploadBean
{

   private Part file;

   public String upload()
   {
      if (file != null) {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                  "Uploaded " + file.getSize() + " bytes!"));
      }
      else {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                  "Part is null!"));
      }
      return null;
   }

   public Part getFile()
   {
      return file;
   }

   public void setFile(Part file)
   {
      this.file = file;
   }

}
