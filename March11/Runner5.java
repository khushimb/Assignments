class Runner5
{
public static void main(String[] args)
{
PowerBank bank1 = new PowerBank();
PowerBank bank2 = new PowerBank();
PowerBank bank3 = new PowerBank();
PowerBank bank4 = new PowerBank();
PowerBank bank5 = new PowerBank();

bank1.weight=56;
bank1.color="pink";
bank1.brand="Samsung";
bank1.volts='9';

System.out.println("PowerBank 1 weight : "+ bank1.weight+  ",PowerBank 1 color: " + bank1.color+  ",PowerBank 1 brand : " + bank1.brand+  ",PowerBank 1 volts : " + bank1.volts);    

bank2.weight=25;
bank2.color="black";
bank2.brand="panasonic";
bank2.volts='3';

System.out.println("PowerBank 2 weight : "+ bank2.weight+  ",PowerBank 2 color: " + bank2.color+  ",PowerBank 2 brand : " + bank2.brand+  ",PowerBank 2 volts : " + bank2.volts);    

bank3.weight=34;
bank3.color="yellow";
bank3.brand="spice";
bank3.volts='8';

System.out.println("PowerBank 3 weight : "+ bank3.weight+  ",PowerBank 3 color: " + bank3.color+  ",PowerBank 3 brand : " + bank3.brand+  ",PowerBank 3 volts : " + bank3.volts);    

bank4.weight=4;
bank4.color="green";
bank4.brand="apple";
bank4.volts='3';

System.out.println("PowerBank 4 weight : "+ bank4.weight+  ",PowerBank 4 color: " + bank4.color+  ",PowerBank 4 brand : " + bank4.brand+  ",PowerBank 4 volts : " + bank4.volts);    

bank1.weight=23;
bank1.color="white";
bank1.brand="nokia";
bank1.volts='5';

System.out.println("PowerBank 5 weight : "+ bank5.weight+  ",PowerBank 5 color: " + bank5.color+  ",PowerBank 5 brand : " + bank5.brand+  ",PowerBank 5 volts : " + bank5.volts);    

}
}