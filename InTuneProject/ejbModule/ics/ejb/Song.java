package ics.ejb;

import javax.annotation.*;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Song
 */
@Stateless
@LocalBean
public class Song implements SongLocal {

    /**
     * Default constructor. 
     */
    public Song() {
    	System.out.println("Constructor anropas");
    }
    
    @PostConstruct
    public void init() {
    System.out.println("PostConstruct init() anropas");
    }
    
    @PreDestroy
    public void destroy() {
    System.out.println("PreDestroy destroy() anropas");
    }
    
	private String name;
    private String id;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


}
