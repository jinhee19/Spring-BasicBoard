<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
var bno = '${place.bno}';

$('[name=replyInsertBtn]').click(function(){
	var insertData = $('[name=replyInsertForm]').serialize();
	replyInsert(insertData);
});


// ��� ���
function replyList(){
	$.ajax({
        url : '/reply/{bno}',
        type : 'get',
        data : {'bno':bno},
        success : function(data){
            var a =''; 
            $.each(data, function(key, value){ 
                a += '<div class="replyArea" style="border-bottom:1px solid darkgray; margin-bottom: 15px;">';
                a += '<div class="replyInfo'+value.rno+'">'+'��۹�ȣ : '+value.rno+' / �ۼ��� : '+value.replyer;
                a += '<a onclick="replyUpdate('+value.rno+',\''+value.reply+'\');"> ���� </a>';
                a += '<a onclick="replyDelete('+value.rno+');"> ���� </a> </div>';
                a += '<div class="replyContent'+value.rno+'"> <p> ���� : '+value.reply +'</p>';
                a += '</div></div>';
            });
            
            $(".replyList").html(a);
        }
    });

}

// ��� ���
function replyInsert(insertData){
	 $.ajax({
	        url : '/reply/new',
	        type : 'post',
	        data : insertData,
	        success : function(data){
	            if(data == 1) {
	                replyList(); //��� �ۼ� �� ��� ��� reload
	                $('[name=reply]').val('');
	            }
	        }
	    });
}

$(document).ready(function(){
	replyList();
});
</script>