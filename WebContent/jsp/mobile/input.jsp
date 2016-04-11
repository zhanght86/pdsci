<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
${callback}({
    "resultId": ${resultId},
    "resultName": ${pdfn:toJsonString(resultName)},
    "visitFlow" :${pdfn:toJsonString(visitFlow)},
    "moduleCode":"${module.moduleCode }",
    "moduleName":"${module.moduleName }",
    "inputStatusId":"${inputStatusId}",
    "oper":"${oper}",
    "moduleShortName":"${module.moduleShortName }"
    <c:if test="${resultId eq '200' }">
    <c:set var="commCode" value="${visitFlow}_${module.moduleCode }"/>
    ,
    "elements":[ 
	    <c:forEach items="${projDescForm.visitModuleElementMap[commCode]}" var="element" varStatus="status">
		    {
		        "elementCode": "${element.elementCode}",
		        "elementName": "${projDescForm.elementMap[element.elementCode].elementName}",
		        "elementSerial": "${projDescForm.elementMap[element.elementCode].elementSerial}",
		        <c:choose>
		        	<c:when test="${projDescForm.elementMap[element.elementCode].elementSerial=='N'}">
		       	"attributes":[
		       		<c:set var="commAttrCode" value="${visitFlow}_${module.moduleCode}_${element.elementCode}"/>
		       		 <c:forEach items="${projDescForm.visitElementAttributeMap[commAttrCode] }" var="attr" varStatus="status1">
		       		 	{
		       		 		"attrCode": "${attr.attrCode}",
		       		 		"attrName": "${projDescForm.attrMap[attr.attrCode].attrName}",
		       		 		"dataTypeId": "${projDescForm.attrMap[attr.attrCode].dataTypeId}",
		       		 		"dataLength": "${projDescForm.attrMap[attr.attrCode].dataLength}",
		       		 		"inputTypeId":"${projDescForm.attrMap[attr.attrCode].inputTypeId}",
		       		 		<c:choose>
		       		 			<c:when test="${oper=='oper1' }">
		       		 				"inputValue":"${elementSerialSeqValueMap[element.elementCode]['1'][attr.attrCode].attrValue1}",
		       		 			</c:when>
		       		 			<c:when test="${oper=='oper2' }">
		       		 				"inputValue":"${elementSerialSeqValueMap[element.elementCode]['1'][attr.attrCode].attrValue2}",
		       		 			</c:when>
		       		 			<c:when test="${oper=='oper3' }">
		       		 				"inputValue":"${elementSerialSeqValueMap[element.elementCode]['1'][attr.attrCode].attrValue}",
		       		 			</c:when>
		       		 			<c:otherwise>
		       		 				"inputValue":"",
		       		 			</c:otherwise>
		       		 		</c:choose>
		       		 		
		       		 		"isViewName": "${projDescForm.attrMap[attr.attrCode].isViewName}"
		       		 		 <c:set var="commCodeFlow" value="${commAttrCode}_${attr.attrCode}"></c:set>
		       		 		<c:if test="${!empty projDescForm.visitAttrCodeMap[commCodeFlow]}">
		       		 		,
		       		 		"codes":[
		       		 			
		       		 			 <c:forEach items="${projDescForm.visitAttrCodeMap[commCodeFlow]}" var="code" varStatus="status2">
		       		 			 	{
	       		 					 "codeValue":	"${projDescForm.codeMap[code.codeFlow].codeValue}",
		       		 				 "codeName":	"${projDescForm.codeMap[code.codeFlow].codeName}"
								    }
		       		 				 <c:if test="${not status2.last }">
										,
									  </c:if>
		       		 			 </c:forEach>
		       		 		]
		       		 		 </c:if>
		       		 	}	
			       		  <c:if test="${not status1.last }">
							,
						  </c:if>
						 
		       		 </c:forEach>
		       	
		       	]
		        	</c:when>
		        	<c:otherwise>
		        		"elementSerialNum":${fn:length(elementSerialSeqValueMap[element.elementCode])}
		        	</c:otherwise>
		        </c:choose>
		        
		    }
		     <c:if test="${not status.last }">
						,
			</c:if>
	 	</c:forEach>
    ]
    </c:if>
})
