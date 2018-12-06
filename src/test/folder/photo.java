package test.folder;

import test.folder.text;
import java.awt.Choice;
import javax.swing.JOptionPane;

public class photo {
    private Choice collectionPhoto_1,collectionPhoto_2,SubCollect;
    private String Photo,file;
    private int IndexDonw,indexphoto;
    private text text;
    photo(){
        file="C:\\\\Users\\\\ASUS\\\\Desktop\\\\New folder\\\\p";
        SubCollect=new Choice();
        collectionPhoto_2=new Choice();
        collectionPhoto_1=new Choice();
        IndexDonw=10;
    }
    public void type(int item){
        for(int i=0;i<10;i++){
            
            String pp=file+item+"\\\\"+String.valueOf(i)+".jpg";
            //System.out.println(pp)
            collectionPhoto_1.add(pp);
            collectionPhoto_2.add(pp);
            SubCollect.add(String.valueOf(i));
        }
    }
    public String getfile(){
        return file;
    }
    public String randomphoto(){
        int random = (int)(Math.random() * IndexDonw);
        indexphoto=Integer.valueOf(SubCollect.getItem(random));
        Photo=collectionPhoto_1.getItem(random);
        collectionPhoto_1.remove(random);
        SubCollect.remove(random);
        IndexDonw--;
        return Photo;
    }
    public int getrandom(){
        return indexphoto;
    }
    public void setphoto(){
        file=JOptionPane.showInputDialog("input");
    }
    public static void main(String args[])  {     
    }
}



