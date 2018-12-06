import java.awt.image.ImageConsumer;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Random;
public class aa {
    public String str,t1,t2,t3,t4,t5;
    aa(){
        t1="จงเลือกรูปภาพที่เป็นต้นไม้";
        t2="จงเลือกรูปภาพที่เป็นป้ายทะเบียนรถ";
        t3="จงเลือกรูปภาพที่เป็นรูปบ้าน";
        t4="จงเลือกรูปภาพที่เป็นป้ายจราจร";
        t5="จงเลือกรูปที่ภาพเป็นรถ";  
    }
    String textrandom(){
        String [] st={t1,t2,t3,t4,t5};
         int random = (int)(Math.random() * 4);
         str=st[random];
         //System.out.println(str);
         return str;
    }
    String t1(){
        t1="จงเลือกรูปภาพที่เป็นต้นไม้";
        return t1;
    }
    String t2(){
        
        return t2;
    }
    String t3(){
        return t3;
    }
    String t4(){
        return t4;
    }
    String t5(){
        return t5;
    }
}