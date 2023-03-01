package ics.ejb;

import javax.ejb.Local;

@Local
public interface SongLocal {
    public String getName();
	public void setName(String name);
	public String getId();
	public void setId(String id);
}
