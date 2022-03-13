package Lab4;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Lab04
{
    public static void main(String[] args)
    {
        File inputFile = new File("C:\\Users\\camer\\OneDrive - Indiana University\\Other\\Code Database\\C201\\src\\Labs\\Lab4\\iusb.jpg");
        File outputFile = new File("C:\\Users\\camer\\OneDrive - Indiana University\\Other\\Code Database\\C201\\src\\Labs\\Lab4\\Lab04_output.jpg");

        // File inputFile = new File("iusb.jpg");
        // File outputFile = new File("Lab04_output.jpg");

        BufferedImage image = null;
        try //read and modify image
        {
            image = ImageIO.read(inputFile);
            show_pixels(image);
            toGrayscale(image);
            mirrorImage(image);
            show_pixels(image);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try // write
        {
            ImageIO.write(image, "jpg", outputFile);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    static void show_pixels(BufferedImage image)
    {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int x=0; x<width; x++)
        {
            for (int y=0; y<height; y++)
            {
                // your code goes here
                // For every pixel (x, y), display its RGB (red, green, blue) value
                Color color = new Color(image.getRGB(x, y));
                System.out.println("R: " + color.getRed() + " - G: " + color.getGreen() + " - B: " + color.getBlue());

                // Original code
                // System.out.print("(" + x + ", " + y + "): " + image.getRGB(x,y) + " ");

                // Reference (getRGB method): https://docs.oracle.com/javase/6/docs/api/java/awt/image/BufferedImage.html
                // Reference (Color Constructor): https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
                // Reference (getRed, getBlue, getGreen methods): https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html

                // This part of code will be given during the lecture
                
            }
            System.out.println();
        }
    }

    static void toGrayscale(BufferedImage image)
    {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int x=0; x<width; x++)
        {
            for (int y=0; y<height; y++)
            {
                // your code goes here, for every pixel (x, y)
                int avg, r, g, b;

                // 1. Get its RGB values of the color: red (r), green (g), and blue (b)
                Color CurrentColor = new Color(image.getRGB(x, y));
                r = CurrentColor.getRed();
                g = CurrentColor.getGreen();
                b = CurrentColor.getBlue();

                // 2. Calculate average value avg=(r+g+b)/3
                avg = (r+g+b) / 3;

                // 3. Create a new color with red = avg, green = avg, and blue = avg
                Color NewColor = new Color(avg, avg, avg);

                // 4. Update the pixel (x, y) with the new color
                image.setRGB(x,y,NewColor.getRGB());

                // Reference (setRGB method): https://docs.oracle.com/javase/6/docs/api/java/awt/image/BufferedImage.html               
                
            }
        }
    }

    static void mirrorImage(BufferedImage image)
    {
        int width = image.getWidth();
        int height = image.getHeight();
        
        for (int x=0; x<width/2; x++)
        {
            for (int y=0; y<height; y++)
            {
                // Your code goes here:
                // For every pixel(x, y), switch its color with with pixel(width-1-x, y)
                int temp = image.getRGB(x,y);

                /*
                // Old code:
                int mirrored_x = width-1-x;

                // Temporary pixel location for a successful mirror
                int rightside_rgb = image.getRGB(x,y);
                int leftside_rgb = image.getRGB(mirrored_x, y);

                // Switching pixels
                image.setRGB(mirrored_x, y, rightside_rgb);
                image.setRGB(x, y, leftside_rgb);
                */
                // Reference (getRGB, setRGB methods): https://docs.oracle.com/javase/6/docs/api/java/awt/image/BufferedImage.html 
                
            }
        }
    }
}