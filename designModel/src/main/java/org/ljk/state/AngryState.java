package org.ljk.state;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 20:36
 */
public class AngryState extends State {
    @Override
    void doWork() {
        System.out.println("angry");
    }
}
