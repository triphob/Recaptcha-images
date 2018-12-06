package test.folder;

import java.awt.Choice;
import java.awt.Image;


public class test {
    Choice a,b,c;
    private String t1;
    private int i,nt;
    private Image pp,d;
    text text;
    public static void main(String[] args){
Choice h=new Choice();
h.addItem("4");
h.add("3");
h.add("1");
boolean che=true;
int k=0;
if(h.getItemCount()<5|h.getItemCount()>5){
    che=false;
    System.out.print(che+"1");
}else{
while(k<h.getItemCount()&che==true){
if(Integer.valueOf(h.getItem(k))<5){
    System.out.print("2");
    k++;
}else{
    che=false;
    System.out.print(che);
}

}
}
System.out.println(che);
}
}
