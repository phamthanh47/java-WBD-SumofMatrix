package com.company;

import java.util.Scanner;

public class Main {
     public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhap so dong: ");
        int row=scanner.nextInt();
        System.out.print("nhap so cot: ");
        int column=scanner.nextInt();
        int[][] arr=new  int[row][column];
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("nhap phan tu arr["+i+","+j+"]= ");
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int x = 0;
        int y=0;
        do{
            System.out.print("nhap cot can tinh sum: ");
             x =scanner.nextInt();
        }while(x >column);
        sumColumn(arr,x);
        System.out.println(sumColumn(arr,x));
        do{
            System.out.print("nhap hang can tinh tong: ");
            y=scanner.nextInt();
        }while(y >row);
        sumRow(arr,y);
        System.out.println(sumRow(arr,y));
    }
    public static int sumColumn(int[][] arr,int x){
        int sum=0;
            for( int i=0;i<arr.length;i++){
                sum += arr[i][x];
            }
            return sum;
        }
        public static int sumRow(int[][] arr,int x){
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum += arr[x][j];
        }
        return sum;
        }
    }
