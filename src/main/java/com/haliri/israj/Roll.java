package com.haliri.israj;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gsp on 15/08/2016.
 */
public class Roll {

    Parameter parameter = new Parameter();
    RandomNumber randomNumber = new RandomNumber();

    List<String> newListA = new ArrayList<String>();
    List<String> newListB = new ArrayList<String>();
    List<String> newListC = new ArrayList<String>();
    List<String> newListD = new ArrayList<String>();


    public void print() {
        parameter.setRangeA(6);
        parameter.setRangeB(6);
        parameter.setRangeC(6);
        parameter.setRangeD(6);


        for (int i = 1; i < 15; i++) {
            parameter.setListNumberA(randomNumber.listNumber(parameter.getRangeA()));
            parameter.setListNumberB(randomNumber.listNumber(parameter.getRangeB()));
            parameter.setListNumberC(randomNumber.listNumber(parameter.getRangeC()));
            parameter.setListNumberD(randomNumber.listNumber(parameter.getRangeD()));

            if (parameter.getRangeA() == 0) {
                System.out.println("<====================== GAME OVER =======================>");
                System.out.println("A Win");
                System.out.println("<====================== GAME OVER =======================>");
                break;
            } else if (parameter.getRangeB() == 0) {
                System.out.println("<====================== GAME OVER =======================>");
                System.out.println("B Win");
                System.out.println("<====================== GAME OVER =======================>");
                break;
            } else if (parameter.getRangeC() == 0) {
                System.out.println("<====================== GAME OVER =======================>");
                System.out.println("C Win");
                System.out.println("<====================== GAME OVER =======================>");
                break;
            } else if (parameter.getRangeD() == 0) {
                System.out.println("<====================== GAME OVER =======================>");
                System.out.println("D Win");
                System.out.println("<====================== GAME OVER =======================>");
                break;
            } else {

                System.out.println();
                System.out.println("ROUND " + i);
                System.out.println("After Dice Rolled");
                System.out.print("Player A = ");
                System.out.println(printResultRoleA(parameter.getListNumberA()));
                System.out.print("Player B = ");
                System.out.println(printResultRoleB(parameter.getListNumberB()));
                System.out.print("Player C = ");
                System.out.println(printResultRoleC(parameter.getListNumberC()));
                System.out.print("Player D = ");
                System.out.println(printResultRoleD(parameter.getListNumberD()));


                System.out.println("After Dice Moved");
                System.out.print("Player A = ");
                System.out.println(printMoveRoleA(parameter.getListNumberA()));
                System.out.print("Player B = ");
                System.out.println(printMoveRoleB(parameter.getListNumberB()));
                System.out.print("Player C = ");
                System.out.println(printMoveRoleC(parameter.getListNumberC()));
                System.out.print("Player D = ");
                System.out.println(printMoveRoleD(parameter.getListNumberD()));
//                System.out.println("Range");
//                System.out.print("Player A = ");
//                System.out.println(parameter.getRangeA());
//                System.out.print("Player B = ");
//                System.out.println(parameter.getRangeB());
//                System.out.print("Player C = ");
//                System.out.println(parameter.getRangeC());
//                System.out.print("Player D = ");
//                System.out.println(parameter.getRangeD());
                System.out.println();
            }
        }
    }

    public String printResultRoleA(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            System.out.print(param.get(i) + " ");
        }
        return "";
    }

    public String printMoveRoleA(List<String> param) {

        for (int i = 0; i < param.size(); i++) {

            if (param.get(i) == "1" ) {
                newListB.add("1");
            }
            param.remove("1");
            param.remove("6");
        }
        parameter.setListNumberBtemp(newListB);
        for (int ii = 0; ii < parameter.getListNumberAtemp().size(); ii++) {
                param.add(parameter.getListNumberAtemp().get(ii));
        }
        for (int x = 0; x < param.size(); x++) {
            System.out.print(param.get(x) + " ");
        }

        parameter.setRangeA(param.size());
        return "";
    }

    public String printResultRoleB(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            System.out.print(param.get(i) + " ");
        }
        return "";
    }

    public String printMoveRoleB(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            if (param.get(i)== "1") {
                newListC.add("1");
            }
            param.remove("1");
            param.remove("6");
        }
        parameter.setListNumberCtemp(newListC);
        for (int ii = 0; ii < parameter.getListNumberBtemp().size(); ii++) {
            param.add(parameter.getListNumberBtemp().get(ii));
        }
        for (int x = 0; x < param.size(); x++) {
            System.out.print(param.get(x) + " ");
        }

        parameter.setRangeB(param.size());
        return "";
    }

    public String printResultRoleC(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            System.out.print(param.get(i) + " ");
        }
        return "";
    }

    public String printMoveRoleC(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            if (param.get(i)=="1") {
                newListD.add("1");
            }
            param.remove("1");
            param.remove("6");
        }
        parameter.setListNumberDtemp(newListD);
        for (int ii = 0; ii < parameter.getListNumberCtemp().size(); ii++) {
            param.add(parameter.getListNumberCtemp().get(ii));
        }
        for (int x = 0; x < param.size(); x++) {
            System.out.print(param.get(x) + " ");
        }

        parameter.setRangeC(param.size());
        return "";
    }

    public String printResultRoleD(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            System.out.print(param.get(i) + " ");
        }
        return "";
    }

    public String printMoveRoleD(List<String> param) {

        for (int i = 0; i < param.size(); i++) {
            if (param.get(i)=="1") {
                newListA.add("1");
            }
            param.remove("1");
            param.remove("6");
        }
        parameter.setListNumberAtemp(newListA);
        for (int ii = 0; ii < parameter.getListNumberDtemp().size(); ii++) {
            param.add(parameter.getListNumberDtemp().get(ii));
        }
        for (int x = 0; x < param.size(); x++) {
            System.out.print(param.get(x) + " ");
        }

        parameter.setRangeD(param.size());
        return "";
    }
}