"use strict";
var app = (()=>{
	return {
		init : x=>{
			alert('컨텍스트: '+x);
			$('#login_btn').on('click',function(){
				alert('컨텍스트 : '+x)
			});
		}
	};
})();