import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class DownloadTimeApp
{
	public static void main (String[]args)
	{
		System.out.println("Welcome to the Download TIme Estimator. This App estimates how long it will take to download a file.");
		
		double fileSize=0.0;
		double downloadSpeed=0.0;
		String choice = "y";
		double seconds=0.0;
		int hours=0;
		int minutes=0;
		int remaning_seconds=0;
		Scanner user = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the file size in MB: ");
			fileSize= user.nextDouble();
			/*while (!fileSize.hasNextDouble())
			{
				System.out.print("Invalid Entry. please a numeric value: ");
				fileSize=user.nextDouble();
			}
			*/
		
			System.out.print("Enter the download speed in MB/sec: ");
			downloadSpeed= user.nextDouble();
			
			seconds=fileSize/downloadSpeed;
			int result_seconds = (int)Math.round(seconds);
			hours=result_seconds/3600;
			remaning_seconds= result_seconds % 60;
			minutes=result_seconds/60;
			System.out.println("This download will take approximately " + hours + " hours " + minutes + " minutes " + "and " + remaning_seconds + " seconds.");
			
			System.out.print("Continue? (y/n): ");
			choice=user.next();
			while (!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y"))
			{
				System.out.print("Invalid Entry. please type \'y\' or \'n\': ");
				choice=user.next();
			}
		}
		
	}
}