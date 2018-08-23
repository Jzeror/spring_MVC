"use strict";

var app = app || {};
app = {
	init : x=>{
		console.log('step : 1');
		app.session.context(x);
		app.onCreate();
	},
	onCreate : ()=>{
		console.log('step : 3');
		app.setContentView();
		
		$('#login_btn_header').click(()=>{
			location.href= "/move/auth/member/login";
		});
		$('#login_btn_nav').click(()=>{
			location.href = app.x()+'/move/auth/member/login';
		});
		$('#loginFormBtn').click(()=>{
			location.href = app.x()+'/member/login';
		});
		$('#login_out_auth').click(()=>{
			location.href = app.x()+'/member/logout';
		});
		$('#join_btn_header').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		$('#join_btn_nav').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		
	},
	setContentView : ()=>{
		console.log('step : 4 ::'+ app.session.path('js')); //이게 실행되면 컨텍스트패스가 session에 저장된걸 확인한거.
	}
};
app.session = {
		context : x=>{
			console.log('step : 2');
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
app.x = ()=>{
	return app.session.path('context');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};