class ChatRunner
{
public static void main(String[] args)
{
Chat chat = new Chat("black",5,"afternoon");
System.out.println("Wallpaper color :"+chat.wallpapercolor +",Number of people chatting :"+chat.ppl +",Time specification :"+chat.time);


Chat chat1 = new Chat("pink",7,"noon");
System.out.println("Wallpaper color :"+chat1.wallpapercolor +",Number of people chatting :"+chat1.ppl +",Time specification :"+chat1.time);


Chat chat2 = new Chat("yellow",8,"morning");
System.out.println("Wallpaper color :"+chat2.wallpapercolor +",Number of people chatting :"+chat2.ppl +",Time specification :"+chat2.time);


Chat chat3 = new Chat("green",7,"midnight");
System.out.println("Wallpaper color :"+chat3.wallpapercolor +",Number of people chatting :"+chat3.ppl +",Time specification :"+chat3.time);


Chat chat4 = new Chat("red",2,"night");
System.out.println("Wallpaper color :"+chat4.wallpapercolor +",Number of people chatting :"+chat4.ppl +",Time specification :"+chat4.time);




}

}