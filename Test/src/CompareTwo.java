package src;

import java.io.*;

public class CompareTwo {
	static String arrayLines1[] = new String[10];
	static String arrayLines2[] = new String[10];
	public static void main(String args[]) throws Exception {
		
		String contents1 = null;
		String contents2 = null;

		int count1 = 0;
		int count2 = 0;

		try {
			FileReader file1 = new FileReader("C:/BEAWorkShop/WLI_EAI_VANITY_Latest/Test/src/Source_file_list.txt");
			FileReader file2 = new FileReader("C:/BEAWorkShop/WLI_EAI_VANITY_Latest/Test/src/Processed_file.txt");

			BufferedReader buf1 = new BufferedReader(file1);
			BufferedReader buf2 = new BufferedReader(file2);

			while ((contents1 = buf1.readLine()) != null) {
				arrayLines1[count1] = contents1;
				count1++;
			}
			while ((contents2 = buf2.readLine()) != null) {
				arrayLines2[count2] = contents2;
				count2++;
			}
		} catch (Exception e) {
		}

		displayRecords();
	}

	public static void displayRecords() throws Exception {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("C:/BEAWorkShop/WLI_EAI_VANITY_Latest/Test/src/OLD.txt"), true);
			for (int i = 0; i < arrayLines1.length; i++) {
				for (int j = 0; j < arrayLines2.length; j++) {
					if (arrayLines1[i] != null && arrayLines2[j] != null && arrayLines1[i].equals(arrayLines2[j])) {
						pw.println(arrayLines1[i]);
					}
				}
			}
			pw.close();
		} catch (Exception e) {
		}
	}

}