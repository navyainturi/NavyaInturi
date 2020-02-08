package com.NewYearGift;

/*
	Enter the number of chocolates : 
	5
	Enter the cost and weight of each chocolate :
	4 40
	6 50
	2 30
	7 60
	1 10
	Sorted list of cost of chocolates:
	1 2 4 6 7 
	Enter the number of Sweets
	5
	Enter the cost of Sweets
	10 15 55 25 20
	Enter a range
	0 50
	Sweets that are under range are : 
	Candie -1  -  cost=10
	Candie -2  -  cost=15
	Candie -4  -  cost=25
	Candie -5  -  cost=20
 */

import java.util.*;
public class App implements NewYearsgift 
{
	int cost,weight;
	public void chocolates(int c,int w)
	{
		cost=c;
		weight=w;
	}
	public void Sweets(int c)
	{
		cost=c;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of chocolates : ");
	int c=sc.nextInt();
	//LinkedList Collection
	LinkedList<Integer> l=new LinkedList<Integer>();
	App c1[]=new App[c];
	for(int i=0;i<c;i++)
	{
		c1[i]=new App();
	}
	System.out.println("Enter the cost and weight of each chocolate : ");
	for(int i=0;i<c;i++)
	{ 
		int cos=sc.nextInt();
		int w=sc.nextInt();
		c1[i].chocolates(cos,w);
		l.add(cos);
	}
	//Sorting Linked List using Collections 
	Collections.sort(l);
	System.out.println();
	System.out.println("Enter the number of Sweets");
	int n=sc.nextInt();
	App s[]=new App[n];
	for(int i=0;i<n;i++)
	{
		//creating objects of sweets
		s[i]=new App();
	}
	System.out.println("Enter the cost of Sweets");
	for(int i=0;i<n;i++)
	{ 
		int cost=sc.nextInt();
		s[i].Sweets(cost);
	}
	System.out.println("Sorted list of cost of chocolates:");
	for(int i=0;i<l.size();i++)
		System.out.print(l.get(i)+" ");
	System.out.println("Enter a range");
	int a=sc.nextInt();
	int b2=sc.nextInt();
	System.out.println("Sweets that are under range are : ");
	for(int i=0;i<n;i++)
	{
		if(s[i].cost>=a && s[i].cost<=b2)
		System.out.println("Candie -"+(i+1)+"  -  cost="+s[i].cost);
	}
	sc.close();
	}
}

/*
INSTALL BUILD

[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com:NewYearGift >---------------------------
[INFO] Building NewYearGift 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Downloading from : https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
[INFO] Downloaded from : https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom (3.9 kB at 2.1 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ NewYearGift ---
[INFO] Deleting C:\Users\pradeep\eclipse-workspace\NewYearGift\target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ NewYearGift ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\pradeep\eclipse-workspace\NewYearGift\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ NewYearGift ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\pradeep\eclipse-workspace\NewYearGift\target\classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ NewYearGift ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\pradeep\eclipse-workspace\NewYearGift\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ NewYearGift ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\pradeep\eclipse-workspace\NewYearGift\target\test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ NewYearGift ---
[INFO] Surefire report directory: C:\Users\pradeep\eclipse-workspace\NewYearGift\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.NewYearGift.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ NewYearGift ---
[INFO] Building jar: C:\Users\pradeep\eclipse-workspace\NewYearGift\target\NewYearGift-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ NewYearGift ---
[INFO] Installing C:\Users\pradeep\eclipse-workspace\NewYearGift\target\NewYearGift-0.0.1-SNAPSHOT.jar to C:\Users\pradeep\.m2\repository\com\NewYearGift\0.0.1-SNAPSHOT\NewYearGift-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\pradeep\eclipse-workspace\NewYearGift\pom.xml to C:\Users\pradeep\.m2\repository\com\NewYearGift\0.0.1-SNAPSHOT\NewYearGift-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 10.286 s
[INFO] Finished at: 2020-02-08T21:19:54+05:30
[INFO] ------------------------------------------------------------------------

*/



