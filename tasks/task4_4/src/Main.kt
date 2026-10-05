// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun toFarenheit(temp: Float) : Float {
    return (temp * 1.8f) + 32.0f;
}

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: This program requires 3 temperatures as command line arguments.");
        exitProcess(1);
    }

    val initTemperature = args[0].toFloat();
    val maxTemperature = args[1].toFloat();
    val temperatureIncrement = args[2].toFloat();
    
    val t = Terminal();
    var temperature = initTemperature;

    t.println(brightWhite("\nTEMPERATURE CONVERSION"))
    t.println(brightWhite("Initial Temperature: ${initTemperature}"))
    t.println(brightWhite("Max Temperature: ${maxTemperature}"))
    t.println(brightWhite("Temperature Increment: ${temperatureIncrement}"))

    t.println(table {
        header {
            style = brightRed 
            row("Celcius Temperature (°C)", "Farenheit Temperature (°F)")
        }
        body {
            column(0) {
                style = brightBlue
            }
            column(1) {
                style = brightGreen
            }

           while (temperature <= maxTemperature) {
            row (
                temperature,
                "%.1f".format(toFarenheit(temperature)),
            )
            temperature += temperatureIncrement;
           }
        }
    });
}