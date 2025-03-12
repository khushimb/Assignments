class Runner12{
public static void main(String[] args)
{ 
Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Camera camera3 = new Camera();
        Camera camera4 = new Camera();
        Camera camera5 = new Camera();

        camera1.brand = "Canon"; camera1.resolution = 24; camera1.zoom = 10; camera1.digital = true;
        camera2.brand = "Nikon"; camera2.resolution = 30; camera2.zoom = 15; camera2.digital = true;
        camera3.brand = "Sony"; camera3.resolution = 40; camera3.zoom = 20; camera3.digital = true;
        camera4.brand = "Fujifilm"; camera4.resolution = 12; camera4.zoom = 5; camera4.digital = false;
        camera5.brand = "GoPro"; camera5.resolution = 16; camera5.zoom = 8; camera5.digital = true;

        System.out.println("Camera 1: " + camera1.brand + ", Resolution: " + camera1.resolution + "MP, Zoom: " + camera1.zoom + "x, Digital: " + camera1.digital);
        System.out.println("Camera 2: " + camera2.brand + ", Resolution: " + camera2.resolution + "MP, Zoom: " + camera2.zoom + "x, Digital: " + camera2.digital);
        System.out.println("Camera 3: " + camera3.brand + ", Resolution: " + camera3.resolution + "MP, Zoom: " + camera3.zoom + "x, Digital: " + camera3.digital);
        System.out.println("Camera 4: " + camera4.brand + ", Resolution: " + camera4.resolution + "MP, Zoom: " + camera4.zoom + "x, Digital: " + camera4.digital);
        System.out.println("Camera 5: " + camera5.brand + ", Resolution: " + camera5.resolution + "MP, Zoom: " + camera5.zoom + "x, Digital: " + camera5.digital);
}
}