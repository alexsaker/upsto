package com.cnaf.upto;


import org.junit.Test;

import org.hamcrest.Matcher;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ControllersTest {

    @Test
    public void get() {
        given()
        .when()
            .request( "GET", "https://developer.uspto.gov/ds-api/")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getDatasetVersionFields_DatasetDefined_Is_Yes() {
        given()
            .pathParam( "dataset", "2\"<O\"_<0&8*1`[E|9I@>=Dr7It[5gon\"x%/!_u[d68U?/Q=m,;1)j:<#n57bt Bv6dm6S(T\\bM8%U:'T*jYePQIt&jMv9Ek[1%2EHl'WbThmgf(DCm7S>@(-4~IH1Ndf.6zvPFJaw65M9`a&;>5&RL6&#(t9@~/SM")
            .pathParam( "version", "*'=\\ztLd^7[ i-ZUv\"ZZ[#\\U)J28|03PgVJr~,PWv0Es0B=09<qa36ghr:E=N")
        .when()
            .request( "GET", "https://developer.uspto.gov/ds-api/{dataset}/{version}/fields")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getDatasetVersionFields_DatasetValueLength_Is_0() {
        given()
            .pathParam( "dataset", "")
            .pathParam( "version", "")
        .when()
            .request( "GET", "https://developer.uspto.gov/ds-api/{dataset}/{version}/fields")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getDatasetVersionFields_DatasetType_Is_Null() {
        given()
            .pathParam( "dataset", "")
            .pathParam( "version", "TAmRb;uwVo<M_Gu&?BU#CcMU)z=<aHX%HI5.i%?*X*yRisrtA;E9aGXV=@+qOylz;FQ|](y5:6)y?h6=_}M}U9YyF:p|awX;@X:rEUH!v6-Z}1RLap-K&^-I/lLPyH8R6z+6R['/h4u]#:hX0[r.Ck@U\\ Q/,K7h8rfK>(kL7m")
        .when()
            .request( "GET", "https://developer.uspto.gov/ds-api/{dataset}/{version}/fields")
        .then()
            // dataset.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void getDatasetVersionFields_VersionType_Is_Null() {
        given()
            .pathParam( "version", "")
            .pathParam( "dataset", "e1w2$#}yZSX8q.i^G_.Lfb[S*=\"P@BME|^;;1D\"X=PA[)Xv'!u8(Yg^7Z\"8cKb^,X;.5)ieg#[:xS? *oopC6;=S{/X'-PXd=Rc-_V>")
        .when()
            .request( "GET", "https://developer.uspto.gov/ds-api/{dataset}/{version}/fields")
        .then()
            // version.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_VersionDefined_Is_Yes() {
        given()
            .pathParam( "version", ":o|yO$1>#^w~:+5|+#\\nZYh6fed0ZutCptV)h{BlBv<ZRyG9cYPXwjiI3['b(KNpX(p>QNE!#kd:?]r/3$m/FS<9z5CGDJTY%'zB?z1+ZdR:lQkzh7~u){yn/`&%l,>xg\\~iSq1Y[u}t4'-<wJq&`S\"By-T0buO[?zIkZi2Kf;YyNDcd,6ubyS]Glvl4IAsf9^^a+04DDo[&Xeh/v2jnmC/tI<<>0T</(M o~")
            .pathParam( "dataset", "jZVtT)bbRbUj!!t7)O>>T$~Ir5!ZoK4f7g/>{V$/0ew_67#Ut$mG^Neaz=&g;|zRR@M)W,W\\:+I]*A.uPpkNyZ19#4Vhvs|X~68MEcT")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", ".S9hz\\sR@7}:>vj2BjC")
            .formParam( "start", "-440060242")
            .formParam( "rows", "-698536558")
            .formParam( "ohohbcrh", "!pH3~,k,t\"]:/&U")
            .formParam( "iczy", "461.0")
            .formParam( "ttjnjgdgoqfa", ".}%E'*ll")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_VersionValueLength_Is_0() {
        given()
            .pathParam( "version", "")
            .pathParam( "dataset", "")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesCriteriaValueLength_Is_0() {
        given()
            .pathParam( "version", ".8c)%~y%&gj@y(8Uf{`.]cd,dA`IjM!|Ui'ogu_~q.q&Q2P_\\e\"J8npkNMB/7'|yD`X^i}@u,5=]DhV)\"#jKI?i+y1\"Z~4_b+XqVI$74J?DB!\\WuI,7=_L@gE08#4wq4eP\"&oSt9R4^=mqgbg| Er{;dcO8WBA&ej-%uftp+HVocDBV)#n[A7pH1`LB.^aV?\\[,)V}rc2*Kp3Le1|s[QO)q+l?<N<]R^8g@nQ?F4^ok)1&r4}-h\"@cOqtG(S")
            .pathParam( "dataset", "]_.3`?N[HQfjf^''eaZ.Np8WVI!.z\"[%7KZV$CL>[),!fK'5DKWb3,3Gn\\'cA9l6Gw)dYOzg6C0M&qM#vYB7.]!22N!~0+RU)W.3AX!]I%vhz,dXW9ApuU;ZKo-FcI6BH>T?}0=gzF7i^y};&l?LFM!13_Ud-Oc}:/D x\\X*s~nDlVL=C^|QHDo-d:\"+*nP{i<A:r=*m&e6f$}YKT2<a_x|m\\BSQ4j=mchP}c@d@x9-V2yU]+4Ez]/}")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesStartValue_Is_0() {
        given()
            .pathParam( "version", "")
            .pathParam( "dataset", "")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "Y7 lby%R06^+rizlQP+;SDu[8((h;gK-#+uO1=B%}|MT3seM\"wAc]TBSyxr@2Jxhy_~vQ2E:HAu8D`p:zqm~6;$jU|~JZ'v=6Kr'^~&vajtq[G`W,GU}pLJK]?S$3}b=iacx\\uy6aDEk%J}(mE@g89t6(t^=Rt[>xppWk{A=Z^9g<=?gU&<Yyb2|@?zk(~~qvcJNtKy6\\7S]l\\O{$e@:0 CR4_\"{8e@ng+0y7cd*_NB4FXTu")
            .formParam( "start", "0")
            .formParam( "rows", "0")
            .formParam( "bdcwmwuns", "-284")
            .formParam( "rzqiviuwnxxmnhw", "-41")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesStartValue_Is_Gt_0() {
        given()
            .pathParam( "version", "V;o(rj#O9yXV0pPG8mY'AA>1Y-.-YadQMP#t'yxt3P4(dsj][}]G*;c#ki9KPg'E_UTWMU9ZQ]r^--Yw[0WoHHC3;q?9_-aq0%pJ+joFo _H{W+JHHtPR90aGics2|")
            .pathParam( "dataset", "Nr2cT_j&OvW7{x$n7.w+}gG[ )Gy0E*d+fFpG-I!HvX)rTq:;rpe7fR(0nHFFXq$\"kq)]&4^mTb tynd B")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "618337609")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesRowsValue_Is_Gt_0() {
        given()
            .pathParam( "version", "")
            .pathParam( "dataset", "")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "]-*5~Z~R}YDq@+VVFz%9<-CY{ueZ-3cTl{x~[r L5JaTM\\qCS,.'8{k=f1~[$&90lO`t/Jk%toKGso!1ru+m] Gg&{(67zT.Kjg$zcLuw`D&eGLRn~c'~ G+iJ,kTyL*<rQ,^WHR%_3vv{@fDM$(+Pj}b|}2H\\:z7;")
            .formParam( "rows", "840792215")
            .formParam( "wd", "-654")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postDatasetVersionRecords_VersionType_Is_Null() {
        given()
            .pathParam( "version", "")
            .pathParam( "dataset", "&[/W^i.QTN\"YC34d3sr1a3WLQo*i[@&t9>ZT7*")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // version.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_DatasetType_Is_Null() {
        given()
            .pathParam( "dataset", "")
            .pathParam( "version", "}|N$g~@>,5i'lH\"Gw/n10SmxhC#i \\<1<oBV,R|6*BlB*6yKpl+n]0{zJ  !7B[oax(76/2eBPj0~EIC8H3=c1H{Y0daUZ]ex|zJd\\OF]lb7)sVr>")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // dataset.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyMediaType_Is_Other() {
        given()
            .pathParam( "version", "0W&uDvw)}cbPRXh9B82wdcZAM`Hm6U(&?~zqo#bxxBY4WDPc\"h)0>(ZrMWPLcIksJx/\\*2=#+u(aZ;bTpxol4,15!TiQ3r@7.HSby4pmpz$oKQwdHJ.)D,I:H5xj&e![@72`oX>q&Ir3Zxy[9DZtOls,FrC4")
            .pathParam( "dataset", "T)N=jT30/+;s6?H\\Fo&o.|VZSR<+>&Jp\\u_\\qks 8jUC,MA$K)!7+y^r5>6S8_EPwb,0%\"@'Xtew_F/VQ{9=9F>k/AxPi^oqYYUlb$-iZE-M}3?rR,l^egGsQ1p)>uGCLH0(Mhe")
            .contentType( "application/xml")
            .request().body( "")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.Media-Type=Other
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedType_Is_Null() {
        given()
            .pathParam( "version", "qaHj|-~1*zQ;|JoleHG~n<Lmn!VEY]c O")
            .pathParam( "dataset", "hz^V]5uRK,s\"Fh^D}kP@1DqA`;tb0Ib.3qQikCd?e|Qm)-6/.M{2&6wz5HH- TdB0J?:@}69`Uu$+?+rBYkV}zrWl:m.FiA2H#V}\\0QbF,vyv0R aTAOwC)!sj({&? OtlpqK][{9`RC<I'=K|[c~^xmN3@Cw0k?r^mM=wdPLwrLS\"2y&2:ug% ):Cd;<c]UuYZ)5M[&z=s<WAQgO8tk=]}j9w3aAIHVbG\\JF")
            .contentType( "application/x-www-form-urlencoded")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedType_Is_NotObject() {
        given()
            .pathParam( "version", "SHH\\1f[R oRMZ,U,44,Rd`D(&jS%h$b{NMzQV-k dQW}aqX(ohb=C9!o}J(1;[%*y]8m52p^X0wfSn)h\\Y59Jo5}}\"[IwZFIrPve.mQE`cx6p`b|Ob$nwVVVk}Fncqb =,)s~")
            .pathParam( "dataset", "F3ZhV;zXUTT]gCjJ-\\*,d~!FY7;A<(&C`$Dkps9r}F mnvLCHK'<#O;a*0~_[q{nGk0pM7?So;OVrrWZ39[jft}cacYMp09{RxrbXOXsSt6L&q@XXxe|+w6;^.8S7Ik^")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "0", "Bfhj")
            .formParam( "1", "FDhl]")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Type=Not object
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesCriteriaDefined_Is_No() {
        given()
            .pathParam( "version", "X\">AiOh[qm|odnAqv|XUhpk?7av19y1wK mU1./<cg's1x%.Zcz[*e#3[t(>i/~]A{YTWv(OnbIv^LjRKDB-\"Y\\WaJp|_'aj!=y+OVvye9wDT9C*8Xm >7cyQ!W^2i<k`y/*i'SL6P%TtCQEgBYE}3(fbVV@@Nqj(H?f")
            .pathParam( "dataset", "y[iq({bn*9M|>H=5Z`(q?db\\h]k#53NDT.0a}/lY^")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "start", "-680779371")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.criteria.Defined=No
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesCriteriaType_Is_Null() {
        given()
            .pathParam( "version", "aAY)>=K^Ca}q@Rf:T?zdoRRNV-3zasfm;fEy&u%iDuA9GO*NV$wA}%jFlK-{jby}qwvM}Sz#o[GL5=809J4sc1DJK\\fMbIN''rU0bCNBwd9ea$D-}L;Rc'B9t]Dh~\"L[`U")
            .pathParam( "dataset", "0Kb 6][?A>ssn],Ny?9_H&|2sx(fH{nLU)$A4X`K5bbT=w4N\\,}+Sy3HtiqMb>n]4/[3?#_b$`p+ ~mRLk6N!Zo-FQkTd%ha-A `>'wXKH$FdS~&Ff*51y!?o'KGZaabG>y$- P%yd7jDx^W_$!7iDo*Fab\"eX0nIPPXh5Hn$B\"IUEl'y3[L$N<P_':6'e=MqbLP#nJGvk>o,1.\"|)654owAQYe1<8DE\"8dzjs+_*b:pp3rTIYgU")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "-504065939")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.criteria.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesStartType_Is_Null() {
        given()
            .pathParam( "version", "\\*TjK;!N.L/X:og*P0|,W43,YBAAq);1idGxZrz;u%)Qv5!}>*v\\pc2\"GI~VJBB=\"]3*Q)<yRO'`E:*6`'3D)!5wLiglRbb#8@fw8&7f\"U~OGATD7+~oT~=3kLjs:=}yiz&]FiN6M1B")
            .pathParam( "dataset", "]7UAy9D?[=/@czMgbIJ!$.}k%!}&y+ iJd DhZz\"+LX$-;rpU%0U)%Db;{s$5X<!px?7q/p[-@%4b_nV[vyi4|,]:&ctt\"x($1kL}IR$!5)@V1=a~v6H#G<s *n3$:RoBXD{QYv@~utc#Y1? da`Xr;,bcpxXykWll><pn~7w{FC5>G(k|exPik8`U\\5'hI}z'8")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.start.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesStartType_Is_NotInteger() {
        given()
            .pathParam( "version", "<i/tQbzI6Gnv|9gPdMI{.F4d)MKQZrkS4^!Y .QH9si]S")
            .pathParam( "dataset", "Xpv|4*/e(>3\"ZPe*!]o5RF0|u&X|un|})+T(xzd$[+J-nqe4!|6!xgGN\"o:e_~q)KLl4hY#$q:MBx=f4j70A&#m>=+V[ly5YKroK`&n4+V%R[Nstgals3@uFZ$Q:]vsBHA+IG|_OO*D>9(=<\" ; PuBQU&s")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "Y")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.start.Type=Not integer
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesRowsType_Is_Null() {
        given()
            .pathParam( "version", "%3o0E7*p4j}bb;?e|xpU*tac5O12VX~E#db/-p^c$CKj+3F5CX-jJVyT6kUR+H }#cV$'K*o]^[Ws>'nQ\\@oqrd#2XL&]U*fX~oJ44)Ue;Pj!66KSa:j9v>!..'JqNg7Kij?0}US.&Oe?Xf9")
            .pathParam( "dataset", "_#,sVt($HV#1TZHc[%/78:IO^-!<|Li%0C9)(dP,JSu@DbhdPnrPN?WKuXS[(}.`'|RK~n)Kg9X:hEZsGKNkS(6vn7+)rv9$+uJy{@d$dYh1p0\"@(`Gr]B0RUsl")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "-229224232")
            .formParam( "rows", "")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.rows.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postDatasetVersionRecords_BodyApplicationXWwwFormUrlencodedValuePropertiesRowsType_Is_NotInteger() {
        given()
            .pathParam( "version", " }?J&e>gj'A~B[ZnL>H:JRB;H?Jg>V}lQ5w\\CH8#^m7Vc8cp'Hr7&a't'W/c.[Y:P@ZOjq L^-ZExLc\\Y/r\\(8~'ubYUNI1PR(`}#={T~ey-xqC2fp*Zly=ubCV_@zLF)x87B--bppyrU:h\"C1KN}ll{H=v+:v\\TR(")
            .pathParam( "dataset", "qd> 8U:.nFQ|$U@HVPCin~SYfk'dhant|(2PO~ 8lAI,4:5gB,z5p[m?rMXl0|Mii8-`obxa~e$W?:7P*I<56-(m\"DX2/Aiqcq)qp?Ep:HUtbF\"#pK&k6m8mq0C6rXl*6^}yGSNW$&pFU/O%Da Ju&d\">*CG0@;:+$54wa>:BQ<cQp4*(~j#kmK=.+:kgbX!J'&(IL3@Zcf1ji&8c")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "criteria", "")
            .formParam( "start", "-1010949667")
            .formParam( "rows", "true")
        .when()
            .request( "POST", "https://developer.uspto.gov/ds-api/{dataset}/{version}/records")
        .then()
            // Body.application-x-www-form-urlencoded.Value.Properties.rows.Type=Not integer
            .statusCode( isBadRequest())
            ;
    }

    private Matcher<Integer> isSuccess() {
        return allOf( greaterThanOrEqualTo(200), lessThan(300));
    }

    private Matcher<Integer> isBadRequest() {
        return allOf( greaterThanOrEqualTo(400), lessThan(500));
    }
}
