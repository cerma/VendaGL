/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author cermak
 */
public class Databaze {
        private static Databaze singleton = null;
        public String s;

        private Databaze(){
        s = "MySQL";
        }

        public static Databaze getInstance(){
        if (singleton == null) {
        singleton = new Databaze();

        }

        return singleton;
        }

}
