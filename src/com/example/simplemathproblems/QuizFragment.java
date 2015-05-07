package com.example.simplemathproblems;

import java.util.Random;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizFragment extends Fragment {
	private TextView random1text;
	private TextView random2text;
	private TextView random3text;
	private TextView random4text;
	private TextView random5text;
	private TextView random6text;
	private int random1;
	private int random2;
	private int random3;
	private int random4;
	private int random5;
	private int random6;
	private Button submitButton;
	private int firstAnswer;
	private int secondAnswer;
	private int thirdAnswer;
	private EditText firstGuess;
	private EditText secondGuess;
	private EditText thirdGuess;
	private int guess1;
	private int guess2;
	private int guess3;
	private ImageView star1;
	private ImageView star2;
	private ImageView star3;

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		super.onCreateView(inflater,  container,  savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_quiz, container, false);
		
		
		random1text = (TextView) view.findViewById(R.id.random1);
		random2text = (TextView) view.findViewById(R.id.random2);
		random3text = (TextView) view.findViewById(R.id.random3);
		random4text = (TextView) view.findViewById(R.id.random4);
		random5text = (TextView) view.findViewById(R.id.random5);
		random6text = (TextView) view.findViewById(R.id.random6);
		firstGuess = (EditText) view.findViewById(R.id.answer1);
		firstGuess.addTextChangedListener(firstGuessTextWatcher);
		secondGuess = (EditText) view.findViewById(R.id.answer2);
		secondGuess.addTextChangedListener(secondGuessTextWatcher);
		thirdGuess = (EditText) view.findViewById(R.id.answer3);
		thirdGuess.addTextChangedListener(thirdGuessTextWatcher);
		star1 = (ImageView) view.findViewById(R.id.imageView1);
		star2 = (ImageView) view.findViewById(R.id.imageView2);
		star3 = (ImageView) view.findViewById(R.id.imageView3);
		
		setNumbers();
		submitButton = (Button) view.findViewById(R.id.button1);
		findAnswers();
		return view;
		
	}
	public void setNumbers()
	{
		Random rn = new Random();
		
		random1 = rn.nextInt(11);
		random1text.setText(String.valueOf(random1));
		random2 = rn.nextInt(11);
		random2text.setText(String.valueOf(random2));
		random3 = rn.nextInt(11);
		random3text.setText(String.valueOf(random3));
		random4 = rn.nextInt(11);
		random4text.setText(String.valueOf(random4));
		random5 = rn.nextInt(11);
		random5text.setText(String.valueOf(random5));
		random6 = rn.nextInt(11);
		random6text.setText(String.valueOf(random6));		
	}
	public void findAnswers()
	{
		firstAnswer= random1+random2;
		secondAnswer = random3-random4;
		thirdAnswer = random5 * random6;
		int correctscore = 0;
		if(firstAnswer == guess1){
			correctscore ++;
		}
		if(secondAnswer == guess2){
			correctScore ++;
		}
		if(thirdAnswer == guess3){
			correctScore ++;
		}
		
		if(correctScore==1){
			
		}
	TextWatcher firstGuessTextWatcher = new TextWatcher()
	{
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count)
		{
			guess1 = Integer.parseInt(s.toString());
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			
		}
	};
	TextWatcher secondGuessTextWatcher = new TextWatcher()
	{
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count)
		{
			guess2 = Integer.parseInt(s.toString());
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			
		}
	};
	TextWatcher thirdGuessTextWatcher = new TextWatcher()
	{
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count)
		{
			guess3 = Integer.parseInt(s.toString());
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			
		}
	};
	}
		
		
	}
	
