"use strict";

var app = app || {};
var user = user || {};
app = {
	init : x=>{
		console.log('step : 1');
		app.session.context(x);
		app.onCreate();
	},
	user : x=>{
		$.each(x, (k,v)=>{
			sessionStorage.setItem(k,v);
		});
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
			sessionStorage.removeItem('sessionMemId');
			sessionStorage.removeItem('sessionName');
			sessionStorage.removeItem('sessionSsn');
			sessionStorage.removeItem('sessionRoll');
			sessionStorage.removeItem('sessionTeamId');
			sessionStorage.removeItem('sessionAge');
			sessionStorage.removeItem('sessionGender');
			location.href = app.x()+'/member/logout';
		});
		$('#join_btn_header').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		$('#join_btn_nav').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		$('#retrieve_btn_header').click(()=>{
			location.href = app.x()+'/member/retrieve/'+sessionStorage.getItem('memId');
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
		$('#updateConfirmBtn').click(()=>{
			$('#update_id').attr({
				action : app.x()+"/member/modify",
				method:"POST"
			}).submit();
		});
		$('#modify_btn_header').click(()=>{
			location.href = app.x()+'/move/'+sessionStorage.getItem('memId')+'/'+sessionStorage.getItem('teamId')+'/'+sessionStorage.getItem('name')+'/'+sessionStorage.getItem('roll')+'/'+sessionStorage.getItem('age')+'/'+sessionStorage.getItem('ssn')+'/'+sessionStorage.getItem('gender');
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
user.session = {
		
};
