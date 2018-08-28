"use strict";

var app = app || {};
app = {
	init : x=>{
		console.log('step : 1');
		app.session.context(x);
		app.onCreate();
	},
	userId : x=>{
		app.session.setSessionMemId(x);
		app.onCreate();
	},
	onCreate : ()=>{
		console.log('step : 3');
		app.setContentView();
		$('#login_btn_header').click(()=>{
			location.href= app.x()+"/move/auth/member/login";
		});
		$('#login_btn_nav').click(()=>{
			location.href = app.x()+'/move/auth/member/login';
		});
		$('#loginFormBtn').click(()=>{
			$('#user-login-form-id').attr({
				action:app.x()+"/member/login",
				method:"POST"
					}).submit();
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
		$('#retrieve_btn_header').click(()=>{
			location.href = app.x()+'/member/retrieve/'+app.session.getSessionMemId();
		});
		$('#join_form_btn').click(()=>{
			/*var form = document.getElementById('join_form');
			form.action = app.x()+"/member/add";
			form.method = "POST";
			form.submit();*/
			
			$('#join_form').attr({
				action:app.x()+"/member/add",
				method:"POST"
					}).submit();
		});
		$('#remove_btn_header').click(()=>{
			location.href = app.x()+'/move/loging/member/remove';
		});
		$('#delete_form_btn').click(()=>{
			$('#delete_form').attr({
					action : app.x()+"/member/remove",
					method:"POST"
			}).submit();
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
		},
		setSessionMemId : x=>{
			sessionStorage.setItem('sessionMemId',x);
		},
		getSessionMemId : ()=>{
			return sessionStorage.getItem('sessionMemId');
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