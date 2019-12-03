<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1 style="background-color: DodgerBlue;">Hello Traveller!! Where
		would you like to go??</h1>

</body>


<form:form id="userinput" modelAttribute="flightpriceobj"
	action="process-flight" method="post">
	
Trip:
	<input type ="radio" name ="trip" /> RoundTrip
	<input type ="radio" name ="trip" /> One Way
	<p></p>
	
	<table align="center">
		<tr>
			<td><form:label path="from">From : </form:label></td>
			<td><form:input path="from" name="from" id="from" /></td>
		</tr>
		<tr>
			<td><form:label path="to">To : </form:label></td>
			<td><form:input path="to" name="to" id="to" /></td>
		</tr>
		<tr>
			<td><form:label path="date">Date :</form:label></td>
			<td><form:input path="date" name="date" id="date" /></td>
		</tr>

	<tr>
				</select>
	
				<option value="Select Airlines">United Airline</option>option>
				<option value="United Airline">United Airline</option>option>
				<option value="American Airline">American Airline</option>option>
				<option value="Spirit">Spirit</option>
				</option>

			</select>
		</tr>
		<tr>
			<td align="left"><form:button id="save" name="save"></form:button>
			</td>
		</tr>
		<tr></tr>
	</table>
</form:form>
</html>