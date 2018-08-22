"use strict";

var app = app || {};
app = {
	init : x=>{
		alert('step 1 ::');
		app.session.context(x);
		app.onCreate();
	},
	onCreate : ()=>{
		alert('step 3 ::');
		app.setContentView();
	},
	setContentView : ()=>{
		alert('step 4 :: ' + app.session.path('js'));
	}
};
app.session = {
		context : x=>{
			alert('step 2 :: '+ x);
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
}; 
