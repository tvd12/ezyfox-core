package com.tvd12.ezyfox.core.command;

/**
 * Run this command to schedule a task
 * 
 * @author tavandung12
 *
 */

public interface Schedule {
    
    /**
     * set delay time
     * 
     * @param time delay time
     * @return this pointer
     */
    public <T extends Schedule> T delay(long time);

    /**
     * set schedule on time or not
     * 
     * @param value true or false
     * @return this pointer
     */
    public <T extends Schedule> T oneTime(boolean value);
    
    /**
     * set period 
     * 
     * @param value period
     * @return this pointer
     */
    public <T extends Schedule> T period(long value);
    
    /**
     * set task
     * 
     * @param value a task
     * @return this pointer
     */
    public <T extends Schedule> T task(Runnable value);
    
    /**
     * start schedule
     */
    public void schedule();
    
    /**
     * stop schedule after done
     */
    public void stop();
    
    /**
     * stop schedule without waiting for task's done
     */
    public void stopNow();
    
}