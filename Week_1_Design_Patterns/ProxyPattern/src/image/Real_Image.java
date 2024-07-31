package image;

//RealImage.java
public class Real_Image implements Image {
 private String fname;

 public Real_Image(String fname) {
     this.fname = fname;
     loadImageFromServer();
 }

 private void loadImageFromServer() {
     System.out.println("Loading is on process image: " + fname);
 }

 @Override
 public void display() {
     System.out.println("Displaying the  image: " + fname);
 }
}
