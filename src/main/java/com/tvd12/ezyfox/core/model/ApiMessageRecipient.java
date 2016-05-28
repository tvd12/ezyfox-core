/**
 * 
 */
package com.tvd12.ezyfox.core.model;

/**
 * @author tavandung12
 *
 */
public interface ApiMessageRecipient {

    /**
     * message's recipient (only for private message)
     * 
     * @return message's recipient
     */
    public <T extends ApiBaseUser> T recipient();
    
}