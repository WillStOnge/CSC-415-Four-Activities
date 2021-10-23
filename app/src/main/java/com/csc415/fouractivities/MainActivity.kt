package com.csc415.fouractivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity()
{
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		findViewById<Button>(R.id.button1).setOnClickListener {
			val intent = Intent(this, SecondActivity::class.java)
			intent.putExtra(EXTRA_MESSAGE, ARTICLE_ONE);
			startActivity(intent)
		}

		findViewById<Button>(R.id.button2).setOnClickListener {
			val intent = Intent(this, SecondActivity::class.java)
			intent.putExtra(EXTRA_MESSAGE, ARTICLE_TWO);
			startActivity(intent)
		}

		findViewById<Button>(R.id.button3).setOnClickListener {
			val intent = Intent(this, SecondActivity::class.java)
			intent.putExtra(EXTRA_MESSAGE, ARTICLE_THREE);
			startActivity(intent)
		}
	}
}