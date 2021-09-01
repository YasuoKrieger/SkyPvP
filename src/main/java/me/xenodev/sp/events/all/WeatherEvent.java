package me.xenodev.sp.events.all;

import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherEvent implements Listener {

    @EventHandler
    public void onChange(WeatherChangeEvent e){
        e.setCancelled(true);
    }
}
