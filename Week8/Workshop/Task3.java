package Workshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
	public List<Integer> read(String filePath){
		List<Integer> a=null;
		try {
			a = new ArrayList<>();
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String d = br.readLine();
			String[] data = d.trim().split(" ");
			for(String num : data) {
				a.add(Integer.parseInt(num));
			}
			br.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return a;	
	}
	
	public List<Integer> getEven(List<Integer> numbers){
		List<Integer> a = new ArrayList<>();
		for(int num : numbers) {
			if(num % 2 == 0) {
				a.add(num);
			}
		}
		return a;
	}
	
	public List<Integer> getOdd(List<Integer> numbers){
		List<Integer> a = new ArrayList<>();
		for(int num : numbers) {
			if(num % 2 != 0) {
				a.add(num);
			}
		}
		return a;
	}
	
	public void writer(List<Integer> numbers, String filePath) {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(filePath));
			for(int num: numbers) {
				w.write(num+ " ");
			}
			
			w.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Task3 n = new Task3();
		List<Integer> a = n.read("destination.txt");
		System.out.println(n.read("destination.txt"));
		System.out.println(n.getEven(a));
		System.out.println(n.getOdd(a));
		n.writer(a, "write.txt");
	}
}
