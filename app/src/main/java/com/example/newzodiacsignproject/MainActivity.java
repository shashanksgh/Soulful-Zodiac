package com.example.newzodiacsignproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.zodiacfinalproject.OUTPUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createZodiacSign(View view) {

        Intent intent = new Intent(this, OutputActivity.class);
        EditText inputName = findViewById(R.id.nameInput);
        EditText inputDay = findViewById(R.id.dayInput);
        EditText inputMonth = findViewById(R.id.monthInput);
//        EditText inputYear = findViewById(R.id.yearInput);

        String name = inputName.getText().toString();
        String tempDay = inputDay.getText().toString();
        String month = inputMonth.getText().toString();

        int day = Integer.parseInt(tempDay);

        String message = "";

        switch (month) {
            case "January":
                if (day < 20)
                    message = "Capricorn";
                else
                    message = "Aquarius";
                break;
            case "February":
                if (day < 19)
                    message = "Aquarius";
                else
                    message = "Pisces";
                break;
            case "March":
                if (day < 21)
                    message = "Pisces";
                else
                    message = "Aries";
                break;
            case "April":
                if (day < 20)
                    message = "Aries";
                else
                    message = "Taurus";
                break;
            case "May":
                if (day < 21)
                    message = "Taurus";
                else
                    message = "Gemini";
                break;
            case "June":
                if (day < 21)
                    message = "Gemini";
                else
                    message = "Cancer";
                break;
            case "July":
                if (day < 23)
                    message = "Cancer";
                else
                    message = "Leo";
                break;
            case "August":
                if (day < 23)
                    message = "Leo";
                else
                    message = "Virgo";
                break;
            case "September":
                if (day < 23)
                    message = "Virgo";
                else
                    message = "Libra";
                break;
            case "October":
                if (day < 23)
                    message = "Libra";
                else
                    message = "Scorpio";
                break;
            case "November":
                if (day < 22)
                    message = "Scorpio";
                else
                    message = "Sagittarius";
                break;
            case "December":
                if (day < 22)
                    message = "Sagittarius";
                else
                    message = "Capricorn";
                break;

            default:
                message = "Please check the format of date of birth";
        }

        String temp = message;

        message = name + ", your Zodiac Sign is\n" + message + "\n\n";

        if(temp == "Aries"){
            message += "The pioneer and trailblazer of the horoscope wheel, Aries energy " +
                    "helps us initiate, fight for our beliefs and fearlessly put ourselves " +
                    "out there.";
        } else if(temp == "Cancer"){
            message += "The natural nurturer of the horoscope wheel, Cancer energy helps us " +
                    "connect with our feelings, plant deep roots and feather our family nests.";
        } else if(temp == "Taurus"){
            message += "The persistent provider of the horoscope family, Taurus energy helps " +
                    "us seek security, enjoy earthly pleasures and get the job done.";
        } else if(temp == "Leo"){
            message += "The drama queen and regal ruler of the horoscope clan, Leo " +
                    "energy helps us shine, express ourselves boldly and wear our " +
                    "hearts on our sleeves.";
        } else if(temp == "Gemini"){
            message += "The most versatile and vibrant horoscope sign, Gemini energy helps us " +
                    "communicate, collaborate and fly our freak flags at full mast.";
        } else if(temp == "Virgo"){
            message += "The masterful helper of the horoscope wheel, Virgo energy teaches " +
                    "us to serve, do impeccable work and prioritize wellbeing—of ourselves, " +
                    "our loved ones and the planet.";
        } else if(temp == "Libra"){
            message += "The balanced beautifier of the horoscope family, Libra energy inspires " +
                    "us to seek peace, harmony and cooperation—and to do it with style and grace.";
        } else if(temp == "Capricorn"){
            message += "The measured master planner of the horoscope family, Capricorn " +
                    "energy teaches us the power of structure and long-term goals.";
        } else if(temp == "Scorpio"){
            message += "The most intense and focused of the horoscope signs, Scorpio energy " +
                    "helps us dive deep, merge our superpowers and form bonds that are built " +
                    "to last.";
        } else if(temp == "Aquarius"){
            message += "The mad scientist and humanitarian of the horoscope wheel, futuristic " +
                    "Aquarius energy helps us innovate and unite for social justice.";
        } else if(temp == "Sagittarius"){
            message += "The worldly adventurer of the horoscope wheel, Sagittarius energy " +
                    "inspires us to dream big, chase the impossible and take fearless risks.";
        } else if(temp == "Pisces"){
            message += "The dreamer and healer of the horoscope family, Pisces energy " +
                    "awakens compassion, imagination and artistry, uniting us as one.";
        } else if(temp == "Please check the format of date of birth"){
            message = "Please check the format of date of birth";
        }

        intent.putExtra(MSG, message);
        startActivity(intent);

    }
}




















