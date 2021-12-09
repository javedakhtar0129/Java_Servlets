package com.Telusko;
/*
||RequestDispatcher and SendRedirect||
1. If there are two servlets s1 and s2 and if instead of sending response to
   user s1 needs to call s2 we use a RequestDispatcher.
2. Here same req and res object of s1 are sent to s2. And s2 returns the same
   response res res1 from s1 to the client/user. The url will be still for s1.
   This works fine when servlets are on same website. But what if these two servlets
   on two different websites.
3. If s1 and s2 are on different websites, lets say s2 is on a payment gateway.
   Here we will use a sendRedirect instead of RequestDispatcher, s1(shop cart) will
   first send a response object to  client(browser) that it is being redirected to
   servlet s2(payment gateway).
4. If s1(shop kart) want to send some data too to s2(payment gateway) then we use a concept
   called 'Session Management'.

*/


public class adSendRedirect {


}
