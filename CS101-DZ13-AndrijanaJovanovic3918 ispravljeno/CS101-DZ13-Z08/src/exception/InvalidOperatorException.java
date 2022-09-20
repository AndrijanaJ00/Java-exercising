/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Andrijana Jovanovic
 */
public class InvalidOperatorException extends Exception{
    
    public InvalidOperatorException() {
        super("Uneta operacije nije validna!");
    }
    
    public InvalidOperatorException(String message) {
        super(message);
    }
    
}
