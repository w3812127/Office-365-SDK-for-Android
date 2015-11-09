/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;





/**
 * The type Calendar.
*/
public class Calendar extends Entity {

    public Calendar(){
        setODataType("#Microsoft.OutlookServices.Calendar");
    }
            
    private String Name;
     
    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value; 
        valueChanged("Name", value);

    }
            
    private CalendarColor Color;
     
    /**
    * Gets the Color.
    *
    * @return the CalendarColor
    */
    public CalendarColor getColor() {
        return this.Color; 
    }

    /**
    * Sets the Color.
    *
    * @param value the CalendarColor
    */
    public void setColor(CalendarColor value) { 
        this.Color = value; 
        valueChanged("Color", value);

    }
            
    private String ChangeKey;
     
    /**
    * Gets the Change Key.
    *
    * @return the String
    */
    public String getChangeKey() {
        return this.ChangeKey; 
    }

    /**
    * Sets the Change Key.
    *
    * @param value the String
    */
    public void setChangeKey(String value) { 
        this.ChangeKey = value; 
        valueChanged("ChangeKey", value);

    }
    
        
    private java.util.List<Event> Events = null;
    
    
     
    /**
    * Gets the Events.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getEvents() {
        return this.Events; 
    }

    /**
    * Sets the Events.
    *
    * @param value the java.util.List<Event>
    */
    public void setEvents(java.util.List<Event> value) { 
        this.Events = value; 
        valueChanged("Events", value);

    }
    
        
    private java.util.List<Event> CalendarView = null;
    
    
     
    /**
    * Gets the Calendar View.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getCalendarView() {
        return this.CalendarView; 
    }

    /**
    * Sets the Calendar View.
    *
    * @param value the java.util.List<Event>
    */
    public void setCalendarView(java.util.List<Event> value) { 
        this.CalendarView = value; 
        valueChanged("CalendarView", value);

    }
}

