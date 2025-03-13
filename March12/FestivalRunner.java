class FestivalRunner
{
public static void main(String[] args)
{


Festival fest1 = new Festival("ugadhi" , 2 , "bevu");
System.out.println( "festival names:"+fest1.name +"holidays : "+fest1.holidays + ",sweets: "+ fest1.sweetname );

Festival fest2 = new Festival("holi" , 5, "rasmalai");
System.out.println( "festival names:"+fest2.name +"holidays : "+fest2.holidays + ",sweets: "+ fest2.sweetname );

Festival fest3 = new Festival("diwali" , 5 , "holige");
System.out.println( "festival names:"+fest3.name +"holidays : "+fest3.holidays + ",sweets: "+ fest3.sweetname );

Festival fest4 = new Festival("sankranti" , 1 , "yallubelaa");
System.out.println( "festival names:"+fest4.name +"holidays : "+fest4.holidays + ",sweets: "+ fest4.sweetname );

Festival fest5 = new Festival("gugammajatare" , 7 , "paysa");
System.out.println( "festival names:"+fest5.name +"holidays : "+fest5.holidays + ",sweets: "+ fest5.sweetname );

}

}