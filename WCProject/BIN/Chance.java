import java.io.*;
import java.util.*;
public class Chance{
	public static void main(String args[]) throws Exception{
		String []cmd= {" -l file.c"," -c file.c"," -w file.c"," -a file.c"," -l file.c -o output.txt",
		" -s -l -w *.c -e stop.txt -o output.txt"," -s -a -c -w *.c -e stop.txt -o output.txt",
		" -c -w -l file.c"," -s -a *.c -e stop.txt"," -c -w -l -a file.c"
		};//测试用例
		for(int i=0; i<cmd.length; i++){
			Process p=Runtime.getRuntime().exec("wc.exe"+cmd[i]);
		}
	}
}
