package image;

public class ProxyImage implements Image {
 private Real_Image real_img;
 private String fname;

 public ProxyImage(String fname) {
     this.fname = fname;
 }

 @Override
 public void display() {
     if (real_img == null) {
         real_img = new Real_Image(fname); 
     }
     realImage.display(); 
 }
}
