/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.rmi.RemoteException;

/**
 *
 * @author RAFIQ
 */
public class Throws {
    public void withdraw(double amount) throws RemoteException, 
      InsufficientFundsException {
      // Method implementation
   }
   // Remainder of class definition

    private static class InsufficientFundsException extends Exception {

        public InsufficientFundsException() {
        }
    }
}
