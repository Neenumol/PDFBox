package com.example.demo.pdfbox;

import be.quodlibet.boxable.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class POA {

    public void generate() throws IOException {
        PDDocument doc = new PDDocument();
        drawFirst_POA(doc);
        drawSecond_POA(doc);
        doc.save("src/main/resources/poa.pdf");
        doc.close();
    }

    private void drawSecond_POA(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float margin = 73;
        float contentFontSize=10f;
        float lineSpace=1.7f;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        draw_POA2(doc, myPage, font,margin,contentFontSize,lineSpace);
        cont.close();
    }

    private void draw_POA2(PDDocument doc, PDPage myPage, PDType1Font font, float margin, float contentFontSize, float lineSpace) throws IOException {
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 70;
        float yPosition = 710;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        Row<PDPage> row = table.createRow(0);
        Cell<PDPage> cell = row.createCell(100,
                "any insurance claims that may arise in relation to the Transaction Documents and Security  Documents, to sign warrants to act on behalf of the Granter in relation to any Transaction  Document or Security Document and to give instructions any such solicitor");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setFontSize(contentFontSize);
        cell.setAlign(HorizontalAlignment.LEFT);
        cell.setLineSpacing(lineSpace);
        LinkedHashMap<Integer,String> data=new LinkedHashMap<>();
        data.put(8, "to pay the solicitors' legal fees of solicitors or debt collection agents acting on behalf of {and to the account of) the Granter in respect of any legal proceedings to recover any debt due under the Transaction documents, Security Documents {subject to such fees being the higher of 20% of the debt and S$50,000) or in relation to any insurance claims that may arise in relation to the Transaction Documents and Security Documents;");
        data.put(9 , "to negotiate and compromise claims for any amounts due under the Transaction Documents, Security Documents or in relation to any insurance claims that may arise in relation to the Transaction Documents and Security Documents as such Attorney or Attorneys, in their sole and absolute discretion deem fit;");
        data.put(10,"to release and discharge any parties from any claims under the Transaction Documents, Security Documents or in relation to any insurance claims that may arise in relation to the Transaction Documents and Security Documents;");
        data.put(11 ,"to execute and perform any other deed, matter, act or thing, take any steps or do anything which it considers in its absolute discretion ought to be done in connection with the above;");
        data.put(12 ,"for any or all of the purposes mentioned herein and as and when any of the Attorneys may deem necessary or expedient to appear before and make applications to any courts, Registrars, Consuls, Consular Agents, Commissioners, Deputy Commissioners, Public Registry Officials, Notaries, Customs and Excise and any other authorities {in Singapore or otherwise); and");
        data.put(13 ,"to allow Validus to appoint delegates {or sub-delegates) in relation to the powers granted to it under this Power of Attorney to such other parties as Validus in its sole and absolute discretion deems appropriate from time to time to carry out all or any of the objects herein authorised and to revoke any such appointment.");
        data.put(14, "The powers and authorities given by this Power of Attorney shall be irrevocable and remain in full force  and effect while the Granter is a party to any Transaction Document and as long as any insurance claims  arising in relation to the Transaction Documents remain outstanding.");
        data.put(15,"The Granter hereby ratifies and confirms and agrees to ratify and confirm whatsoever of the said  Attorneys shall do or purport to do by reason of these presents including whatsoever shall be done until  the time of expiry of this Power of Attorney. The Granter further ratifies, confirms and agrees to be bound  by the Investors' Terms and Conditions as the same may be revised from time to time.");
        data.put(16,"The Granter irrevocably and unconditionally undertakes to indemnify each Attorney and his estate against  all actions, proceedings, claims, costs expenses and liability of every description arising from the exercise,  or purported exercise, in good faith of any of the powers conferred by this Power of Attorney.");
        data.put(17,"This Power of Attorney shall be governed by and construed in accordance with the laws of Singapore.");
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            row = table.createRow(0);
            if(entry.getKey() < 14 ) {
                cell = row.createCell(6, (entry.getKey()) + ".");
                cell.setBottomBorderStyle(null);
                cell.setTopBorderStyle(null);
                cell.setLeftBorderStyle(null);
                cell.setRightBorderStyle(null);
                cell.setLineSpacing(lineSpace);
                cell.setFontSize(contentFontSize);
                cell = row.createCell(94, entry.getValue());
            }else{
                cell = row.createCell(100,entry.getValue());
            }
            cell.setBottomBorderStyle(null);
            cell.setTopBorderStyle(null);
            cell.setLeftBorderStyle(null);
            cell.setRightBorderStyle(null);
            cell.setLineSpacing(lineSpace);
            cell.setFontSize(contentFontSize);
            str.append("<br><br>");
        }

        table.draw();
    }

    private void drawFirst_POA(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 73;
        float contentFontSize=9.7f;
        float lineSpace=1.6f;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        createHeading(cont, startX, yOffset, leading,doc,myPage,font,margin,lineSpace);
        draw_POA(doc, myPage, font,margin,contentFontSize,lineSpace);
        cont.close();
    }

    private void createHeading(PDPageContentStream cont, float startX, float yOffset, float leading, PDDocument doc, PDPage myPage, PDType1Font heading, float v, float margin) throws IOException {
        cont.beginText();
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 710;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        Row<PDPage> headerRow = table.createRow(0);
        Cell<PDPage> cell = headerRow.createCell(100,
                "<b>IRREVOCABLE LIMITED POWER OF ATTORNEY</b>");
        cell.setTopBorderStyle(null);
        cell.setFontSize(13);
        cell.setFont(heading);
        cell.setAlign(HorizontalAlignment.CENTER);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.draw();

    }

    private void draw_POA(PDDocument doc, PDPage myPage, PDType1Font font, float margin, float contentFontSize, float lineSpace) throws IOException {
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 70;
        float yPosition = 680;
        StringBuilder str =new StringBuilder();
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        Row<PDPage> row = table.createRow(0);
        Cell<PDPage> cell = row.createCell(100,
                "<b>BY THIS POWER OF ATTORNEY</b> made on ________ , ____________________ (NRIC No./ Singapore identity/Passport) No. _____________(the <b>Grantor</b>) of __________________________ irrevocably constitutes and  appoints <b>VALIDUS CAPITAL PTE.LTD.</b> (Company Registration No. 201530032R)  (Validus), any receiver appointed under a Transaction Document (as defined in the Investors' Terms  and Conditions entered into between the Granter and Validus (the <b>Investors' Terms and Conditions</b>)  or a Security Document (as defined in the Investors' Terms and Conditions) and any of their delegates  or sub-delegates (the <b>Attorneys</b>) each to be the true and lawful attorney-in-fact of the Granter so that  each of them may act jointly and severally each with full power of substitution on behalf of the Granter  according to the following powers and terms, each without further reference to the Granter: ");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setFontSize(contentFontSize);
        cell.setLineSpacing(lineSpace);
        row = table.createRow(0);
        cell = row.createCell(5,"1");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);
        cell = row.createCell(95,"to sign, seal, execute, deliver, perfect and/or do all deeds, agreements, instruments, acts and things which may be required pursuant to:");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);
        cell.setFontSize(contentFontSize);
        row = table.createRow(0);
        cell = row.createCell(15,"a.");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);
        cell.setAlign(HorizontalAlignment.RIGHT);
        cell = row.createCell(85,"the Transaction Documents and Security Documents, as the same may from time to time be amended, varied, modified or supplemented; or");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);
        cell.setFontSize(contentFontSize);
        row = table.createRow(0);
        cell = row.createCell(15,"b.");
        cell.setAlign(HorizontalAlignment.RIGHT);
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);
        cell.setFontSize(contentFontSize);
        cell = row.createCell(85,"in relation to any insurance claims that may arise in relation to the Transaction Documents and Security Documents;");
        cell.setBottomBorderStyle(null);
        cell.setTopBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        cell.setLineSpacing(lineSpace);
        cell.setFontSize(contentFontSize);

        LinkedHashMap<String,String> data=new LinkedHashMap<>();
        data.put("2.", "to act for and on behalf of the Granter in relation to any debt due to the Granter, and to receive any and   all sums due to the Granter, under the Transaction Documents or in relation to any insurance claims that may arise in relation to the Transaction Documents;");
        data.put("3.","to take any steps to recover all and any amounts due under the Transaction Documents, Security Documents or in relation to any insurance claims that may arise in relation to the Transaction Documents and Security Documents as the relevant Attorney or Attorneys deem fit;");
        data.put("4.","to carry out any sale, transfer, assignment, lease or other dealings for conveying or transferring any legal estate or other interest in land or other property or otherwise pursuant to or in connection with the Transaction Documents and Security Documents;");
        data.put("5.","to get in the assets subject to any security under any Security Document, and generally to exercise its powers, rights, authorities and discretions conferred on it by or pursuant to such Security Document or by law, and to sign, seal and/or deliver and otherwise perfect any deed, assurance, agreement, assignment, charge, conveyance, mortgage, transfer, instrument or act which it may deem proper in or for the purpose of exercising any of such powers, rights, authorities and discretions;");
        data.put("6.","to enforce, commence and terminate any action or proceedings, sign any affidavit, give evidence and/or disclose such documents and information as may be required, file or submit any claims and receive the awarded claims in any courts or legal proceedings pursuant to or in connection with the Transaction Documents, relevant Security Documents or any insurance claims that may arise in relation to the Transaction Documents and Security Documents, in the Grantor's name;");
        data.put("7.","to appoint, instruct and agree the fees and disbursements of such solicitors as they deem fit to act for the Granter in relation to any Transaction Document, Security Document or in relation to");
        for (Map.Entry<String, String> entry : data.entrySet()) {
            row = table.createRow(0);
            cell = row.createCell(6,entry.getKey());
            cell.setBottomBorderStyle(null);
            cell.setTopBorderStyle(null);
            cell.setLeftBorderStyle(null);
            cell.setRightBorderStyle(null);
            cell.setLineSpacing(lineSpace);
            cell.setFontSize(contentFontSize);
            cell = row.createCell(94,entry.getValue());
            cell.setBottomBorderStyle(null);
            cell.setTopBorderStyle(null);
            cell.setLeftBorderStyle(null);
            cell.setRightBorderStyle(null);
            cell.setLineSpacing(lineSpace);
            cell.setFontSize(contentFontSize);
            str.append("<br><br>");
        }
        table.draw();
    }
}
