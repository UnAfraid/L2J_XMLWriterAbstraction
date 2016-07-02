/*
 * Copyright (C) 2004-2014 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.xml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author UnAfraid
 */
public class XMLElement
{
	private String _name;
	private String _value;
	private String _comment;
	private List<XMLAttribute> _attributes;
	private List<XMLElement> _entries;
	
	public XMLElement(String name)
	{
		_name = name;
	}
	
	public XMLElement(String name, String value)
	{
		_name = name;
		_value = value;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String name)
	{
		_name = name;
	}
	
	public String getValue()
	{
		return _value;
	}
	
	public void setValue(String val)
	{
		_value = val;
	}
	
	public String getComment()
	{
		return _comment;
	}
	
	public void setComment(String comment)
	{
		_comment = comment;
	}
	
	public void addAttribute(XMLAttribute attr)
	{
		if (_attributes == null)
		{
			_attributes = new ArrayList<>();
		}
		_attributes.add(attr);
	}
	
	public List<XMLAttribute> getAttributes()
	{
		return _attributes != null ? _attributes : Collections.emptyList();
	}
	
	public void addEntry(XMLElement entry)
	{
		if (_entries == null)
		{
			_entries = new ArrayList<>();
		}
		_entries.add(entry);
	}
	
	public List<XMLElement> getEntries()
	{
		return _entries != null ? _entries : Collections.emptyList();
	}
}
