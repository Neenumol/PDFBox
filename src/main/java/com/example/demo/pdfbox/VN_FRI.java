package com.example.demo.pdfbox;

import be.quodlibet.boxable.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.awt.*;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class VN_FRI {

    public void generate() throws IOException {

        PDDocument doc = new PDDocument();
        pageOne(doc);
        pageTwo(doc);
        pageThree(doc);
        pageFour(doc);
        pageFive(doc);
        pageSix(doc);
        pageSeven(doc);
        pageEight(doc);
        pageNine(doc);
        doc.save("src/main/resources/fri.pdf");
        doc.close();
    }


    private void pageOne(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
      //  PDType1Font font = PDType1Font.HELVETICA;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
       // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading(cont, fontBold, startX, yOffset, leading,doc,myPage);
        createContent(cont, width, font);
        cont.close();
    }

    private void pageTwo(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createSecondPageHeading(cont, width, font);
        drawPage_TwoTable(doc, myPage);
        cont.close();
    }



    private void pageThree(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        drawPage_ThirdTable(doc, myPage);
        smeTable(doc, myPage);
        docTable(doc, myPage);
        cont.close();
    }

    private void pageFour(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        drawPageFour_Table(doc, myPage);
        createHeading1(cont, fontBold, startX, yOffset, leading);

        fouthPageContent(cont, width, font,doc,myPage);
        // drawPageFourTable(doc, myPage);
        cont.close();
    }

    private void pageFive(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createfifthContent(cont, width, font,doc, myPage);
        cont.close();
    }


    private void pageSix(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        PageSixtTableAndContent(cont, width, font,doc, myPage);
        cont.close();
    }
    private void pageSeven(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createSeventPageContent(cont, width, font);
        cont.close();
    }

    private void pageEight(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createEightPageContent(cont, width, font);
        cont.close();
    }

    private void pageNine(PDDocument doc) throws IOException {
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createNinePageContent(cont, width, font);
        cont.close();
    }



    private void createfifthContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        Paragraph paragraph = new Paragraph();


        String text = "(We/I also confirm that we/I have sufficient Available Funds to effect the Investment Commitment below" +
                "(including any insurance premium payable) and acknowledge that failure to do so will result in us/me incurring a" +
                "fee of 1% of the Investment Commitment amount subject to a minimum of VND 5.000.000 which will be" +
                "deducted from our/my Account.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(We/I understand that the amounts disbursed to the SME (including, without limitation, the Investment" +
                        "Commitment) may be applied towards satisfaction of the SME’s debt including any such debt financed through" +
                        "Validus.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(We/I understand and fully agree that the Investment Commitment submitted below shall constitute an" +
                        "acceptance made by us/me, by which the lending transaction between us/me and the relevant SME is executed." +
                        "We/I however understand and fully agree that, such lending transaction may only take effect, together with the" +
                        "other lending transactions between the other Investors and the relevant SMEs (if any), when the total amount of" +
                        "this Investment Commitment and the other submitted Investment Commitments (if any) is equal to the" +
                        "Requested Amount.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(We/I also understand and agree that the effective date of the lending transaction between us/me and the" +
                        "relevant SME is the date of a notice of validation delivered to us/me by Validus, provided that the" +
                        "aforementioned condition for effectiveness is satisfied.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(In view of and subject to the above, we/I wish to submit our/my Investment Commitment as below:)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        drawFifthTable(doc,myPage);
    }

    private void drawFifthTable(PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 190;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50,
                "");
        cell.setBottomBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow.createCell(50, "VND ....................................................");
        cell.setBottomBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);

        table.addHeaderRow(headerRow);
        table.draw();
    }


    private void smeTable(PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 460;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(Other Information on SME)");
        cell.setValign(VerticalAlignment.MIDDLE);

        LinkedHashMap<String, String> tableRawData = new LinkedHashMap<>();
        tableRawData.put("(Industry):", "Arts, Entertainment & Recreation");
        tableRawData.put("(Years in operation):", "1");
        tableRawData.put("(Name of relevant debtor):",
                "TRAN THI THANH NHAN");
        tableRawData.put("(Invoice amount (Total)):",
                "VND 6,000,000,000");


        for (Map.Entry<String, String> entry : tableRawData.entrySet()) {
            Row<PDPage> rowEntry = table.createRow(defaultRowHeight);
            cell = rowEntry.createCell(50, entry.getKey());
            cell = rowEntry.createCell(50, entry.getValue());
        }

        table.addHeaderRow(headerRow);
        table.draw();
    }
    private void docTable(PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 200;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(Documents Relevant):<br><br><br>");
        cell.setBottomBorderStyle(null);
        Row<PDPage> row2 = table.createRow(defaultRowHeight);
        cell = row2.createCell(100,
                "(Business Registration Certificate of SME)");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell.setTextColor(Color.blue);
        cell.setBottomBorderStyle(null);
        table.addHeaderRow(headerRow);
        table.draw();
    }
    private void drawPageFour_Table(PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = 0;
        float bottomMargin = 20;
        float yPosition = 700;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(100,
                "History of SME funding with Validus)<br><br><br>"
                        + "Likely repayment schedule (subject to actual repayment schedule))<br><br><br>");

        cell.setTopBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell.setBottomPadding((float) 100);
        tenureTable(doc, myPage);
        Row<PDPage> headerRow2 = table.createRow(defaultRowHeight);
        cell = headerRow2.createCell(100,
                "(This Facility Request is governed by the applicable laws of Vietnam.)");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        table.draw();
    }


    private void tenureTable(PDDocument doc, PDPage myPage) throws IOException {

        float margin1 = 75 + 5;
        float yStartNewPage1 = myPage.getMediaBox().getHeight() - (4 * margin1);
        float tableWidth1 = myPage.getMediaBox().getWidth() - (2 * margin1) - 5;
        boolean drawContent1 = true;
        float yStart1 = yStartNewPage1;
        float bottomMargin1 = 70;
        float yPosition1 = 650;

        BaseTable table =
                new BaseTable(yPosition1, yStartNewPage1, bottomMargin1, tableWidth1,
                        margin1, doc, myPage, true, drawContent1);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell =
                headerRow.createCell(16, "Tenor<br>" + "(days)");
        cell =
                headerRow.createCell(16, "Principal<br>" + "(VND)<br>" + "(A)");
        cell =
                headerRow.createCell(16, "Total<br>" + "Interest<br>" + "(VND)<br>" + "(B)");
        cell =
                headerRow.createCell(16, "Validus<br>" + "Commission<br>" + "(inclusive of<br>" + "VAT)<br>" + "(VND)<br>" + "(C)");
        cell =
                headerRow.createCell(16, "Net Interest to<br>" + "Investor<br>" + "(VND)<br>" + "(B-C)");
        cell =
                headerRow.createCell(21, "Total (P+I)<br>" + "(VND)<br>" + "(A + B – C");
        Row<PDPage> row1 = table.createRow(defaultRowHeight);
        cell = row1.createCell(16, "90");
        cell =
                row1.createCell(16, "4,000,000,000");
        cell =
                row1.createCell(16, "144,000,000");
        cell =
                row1.createCell(16, "15,840,000");
        cell =
                row1.createCell(16, "128,160,000");
        cell =
                row1.createCell(21, "4,128,160,000");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void fouthPageContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 500;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "We/I hereby agree to be irrevocably bound by the Investor’s Terms and Conditions and the terms of this Facility<br>" +
                        "<br>Request and understand that these will apply to our/my Investment Commitment submitted below.)");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(100,
                " <br><br><br>(We/I further confirm that we/I have read and understood and agree to be bound by the Transaction Documents<br>" +
                        " <br>and Security Documents relevant to this Investment Request (including, without limitation, the SMEs’ Terms and<br>" +
                        " <br>Conditions and the Important information on Validus Vendor Financing, Deed of Guarantee, Deed of Corporate<br>" +
                        " <br>Guarantee and Security Deed, where applicable, and this Facility Request). We/I further confirm that we/I have<br>" +
                        " <br>done our/my own due diligence, risk analysis and financial assessment of the investment herein and further<br>" +
                        " <br>confirm that we/I have sought out independent legal advice and will not hold Validus liable for any or the total<br>" +
                        " <br>loss of our/my Investment Commitment.)");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow1);
        table.draw();
    }

    private void drawPage_TwoTable(PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 590;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50,
                "(Name of SME) : PIA FAMILY");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow.createCell(50, "(Business Registration Number): 01111111111");
        cell.setValign(VerticalAlignment.MIDDLE);


        LinkedHashMap<Integer, String> productMap = new LinkedHashMap<>();
        productMap.put(1, "(Invoice Financing)");
        productMap.put(2, "(Vendor Financing)");
        productMap.put(3, "(Distributor Financing)");
        productMap.put(4, "(Purchase Order Financing)");
        productMap.put(5, "(Working Capital Financing)");

        Row<PDPage> productTypeRow = table.createRow(50);
        StringBuilder str = new StringBuilder();
        str.append("(Type of Facility Application):<br><br>");
        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
            str.append(entry.getValue());
            str.append("<br><br>");
        }
        cell = productTypeRow.createCell(100, str.toString());

        LinkedHashMap<String, String> tableRawData = new LinkedHashMap<>();
        tableRawData.put("(Request Period):", "(Investors must fund this Facility by 15/10/2020 if" +
                "they wish to participate in this Facility.)");
        tableRawData.put("(Requested Amount):", "VND 4,000,000,000");
        tableRawData.put("(Investment Threshold):",
                "80%");
        tableRawData.put("(Expected" +
                        "Tenor of Investment):",
                "(3 month(s) from" +
                        "date of disbursal)");
        tableRawData.put("(Interest Rate per month):", "1.2% tháng");
        tableRawData.put("(Interest Structure) :",
                "(Declining Balance - interest accrual on the" +
                        "outstanding principal)");
        tableRawData.put("",
                "11%");

        for (Map.Entry<String, String> entry : tableRawData.entrySet()) {
            Row<PDPage> rowEntry = table.createRow(defaultRowHeight);
            cell = rowEntry.createCell(50, entry.getKey());
            cell = rowEntry.createCell(50, entry.getValue());

        }

        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void drawPage_ThirdTable(PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 640;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50,
                "(Administration Fees)");
        cell.setTopBorderStyle(null);
        cell = headerRow.createCell(50, "(11% of all Interest Rate payments or any other" +
                "payments received in the Escrow Account in" +
                "accordance with the corresponding Transaction" +
                "Document (Inclusive of VAT))");
        cell.setTopBorderStyle(null);


        Row<PDPage> productTypeRow = table.createRow(50);
        StringBuilder str = new StringBuilder();
        str.append("<b>(Additional Information)</b>");
        cell = productTypeRow.createCell(100, str.toString());
        cell.setValign(VerticalAlignment.MIDDLE);
        Row<PDPage> productTypeRow1 = table.createRow(50);
        cell = productTypeRow1.createCell(100, "(Security / Guarantee (if applicable))<br><br><br><br><br>"+"(A Deed of Guarantee executed or to be executed by the key persons of the SME and/or a Corporate" +
                "Guarantee executed or to be executed by the related group entities of the SME. (as may be required by" +
                "Validus))");
        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void PageSixtTableAndContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 640;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50,
                "(Investment Commitment):");
        cell.setTopBorderStyle(null);
        cell = headerRow.createCell(50, "VND 50.000.000<br>" +
                "<br>(Note: Subject to a minimum Investment<br>"+
        "<br>Commitment of VND 50.000.000)");
        cell.setTopBorderStyle(null);

        table.addHeaderRow(headerRow);
        table.draw();
       sixthPageContent(cont, width, font,doc,myPage);

    }

    private void sixthPageContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 450;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(Please deduct the above Investment Commitment, applicable fees and insurance premium payable (if<br>" +
                        "<br>applicable) from our/my Account at the end of the Request Period, in accordance with the terms of the Investor’s<br>" +
                        "<br>Terms and Conditions and this Facility Request.)<br><br><br><br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(100,
                "(IMPORTANT INFORMATION ON VALIDUS VENDOR FINANCING AND THIS FACILITY REQUEST)<br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow1);
        Row<PDPage> headerRow2 = table.createRow(defaultRowHeight);
        cell = headerRow2.createCell(100,
                "(Vendor financing)<br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow2);

        Row<PDPage> headerRow3= table.createRow(defaultRowHeight);
        cell = headerRow3.createCell(100,
                "(SME wishes to receive financing through Validus Platform and presents invoices to Vgrowth Development Co.,<br>" +
                        "<br>Ltd. (“Validus”) to support such financing.)<br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow2);

        Row<PDPage> headerRow4= table.createRow(defaultRowHeight);
        cell = headerRow4.createCell(100,
                "(The Investors, through Validus, will funds the SME with Funded Amount, which will be disbursed in various<br>" +
                        "<br>instalments. The SME shall fulfil its repayment obligation for Funded Amount when due and payable to the<br>" +
                        "<br>Investors, through Validus and into the Escrow Account, on or before payment due date.)<br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow2);

        Row<PDPage> headerRow5= table.createRow(defaultRowHeight);
        cell = headerRow5.createCell(100,
                "(For the avoidance of doubt, the SME shall not assign the claim over receivables of the invoice amount to the<br>" +
                        "<br>Investors. Until the debtor of the invoices sufficiently redirects payment to the Investors, through Validus and into<br>" +
                        "<br>the Escrow Account, nothing in this Vendor Financing Facility Terms and Conditions shall release the SME from<br>" +
                        "<br>its liability for repaying the Funded Amount to Investors, through Validus.)<br><br><br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow2);
        table.draw();
    }


    private void createSecondPageHeading(PDPageContentStream cont, float width,
                                         PDType1Font font)
            throws IOException {
        Paragraph paragraph = new Paragraph();


        String text = "(We/I acknowledge that this Facility Request is not an offer but an invitation to offer and that the submission of<br>" +
                "<br>an Investment Commitment constitutes an irrevocable acceptance from us/me under the terms of the Investors’<br>" +
                "<br>Terms and Conditions and the terms herein to the offer made by the relevant SME.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createContent(PDPageContentStream cont, float width,
                               PDType1Font font)
            throws IOException {

        Paragraph paragraph = new Paragraph();
   /*String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String  text = "(Terms defined and the rules of interpretation in the Investors’ Terms and Conditions have the same meaning" +
                "and effect in this Facility Request unless a different meaning is ascribed to it here.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(The terms in this Facility Request shall be read together with the terms of the Investors’ Terms and Conditions" +
                        "in relation to this Facility Request and the terms of the Investors’ Terms and Conditions shall apply to this Facility" +
                        "Request as if set out herein, mutatis mutandis.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(For the avoidance of doubt, the terms of the Investors’ Terms and Conditions shall continue to apply to us/me in" +
                        "our/my dealings through the Platform and our/my Account.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createHeading(PDPageContentStream cont, PDType1Font fontBold,
                               float startX, float yOffset, float leading, PDDocument doc, PDPage myPage)
            throws IOException {

        cont.beginText();
        cont.setFont(PDType1Font.TIMES_ITALIC, 10.0f);
        cont.newLineAtOffset(startX, yOffset);

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 710;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "<b>(FACILITY REQUEST FOR INVESTORS)</b>");
        cell.setTopBorderStyle(null);
        cell.setFontSize(13);
        cell.setAlign(HorizontalAlignment.CENTER);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        table.draw();

        /*yOffset -= leading;
        cont.showText("(FACILITY REQUEST FOR INVESTORS)");
        cont.newLineAtOffset(0, -leading);*/
    }

    private void createHeading1(PDPageContentStream cont, PDType1Font fontBold,
                                float startX, float yOffset, float leading)
            throws IOException {

        cont.beginText();
        cont.setFont(fontBold, 10.0f);
        cont.newLineAtOffset(startX, yOffset);
        yOffset -= leading;
        cont.showText("");
        cont.newLineAtOffset(0, -leading);
    }

    private PDPageContentStream logoCreation(PDDocument doc,
                                             PDPageContentStream cont, float startX, float startY)
            throws IOException {
        float yOffset = startY;
        yOffset = startY;
        yOffset -= 2;
        PDImageXObject pdImage = PDImageXObject.createFromFile(
                "src/main/resources/static/validus-new.png", doc);
        cont.drawImage(pdImage, startX, startY, 200, 40);
        return cont;
    }

    private void createSeventPageContent(PDPageContentStream cont, float width, PDType1Font font) throws IOException {

        Paragraph paragraph = new Paragraph();
  /*  String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String text = "(Except in certain cases where the SME has granted a Security Deed as security to the Facility, the only<br>" +
                "<br>recourse in the event of non-payment is against the SME and/or the guarantors for the SME (being the SME’s<br>" +
                "<br>director(s)) and not the debtor of the invoices. This includes instances where the debtors to the invoices are<br>" +
                "<br>notified to redirect payment to Validus’ escrow account for the participating Investors.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Facility Request)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(This publication shall not be shown, re-transmitted, re-distributed, disclosed or copied, in whole or in part, by<br>" +
                        "<br>any person for whatever purpose without the prior written consent of Validus. Distribution of this publication or<br>" +
                        "<br>information within to any person (other than the person whom the information was originally delivered and to<br>" +
                        "<br>such persons’ advisors) is unauthorised.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(This publication may refer to certain features of an investment/financing but does not purport to contain a<br>" +
                        "<br>complete description of all material terms or of the terms which may differ from those summarised in this<br>" +
                        "<br>publication. Accordingly, this publication is qualified in its entirety by the more detailed documentation relating to<br>" +
                        "<br>the investment/financing. Information in this publication is based upon certain assumptions and analysis of<br>" +
                        "<br>information available as at the date of the publication and reflects prevailing conditions and Validus’ views as of<br>" +
                        "<br>such date, all of which are subject to change at any time without notice. Although reasonable care has been<br>" +
                        "<br>taken to ensure the accuracy of information contained in this publication, Validus makes no representation or<br>" +
                        "<br>warranty of any kind, express, implied or statutory, and shall not be responsible or liable for the accuracy or<br>" +
                        "<br>completeness of the information.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }
    private void createNinePageContent(PDPageContentStream cont, float width, PDType1Font font) throws IOException {

        Paragraph paragraph = new Paragraph();
  /*  String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String text = "(The above information is strictly for general information only and does not constitute, and shall not be deemed<br>" +
                "<br>to constitute an offer, solicitation, advice or recommendation to buy or sell any investment or invest in any<br>" +
                "<br>company, or to grant any financing. This publication should not be construed as accounting, legal, regulatory,<br>" +
                "<br>tax, financial or other advice. Investments are not obligations of, deposits in, or guaranteed or insured by<br>" +
                "<br>Validus, or any of its subsidiary, associate, affiliate or distributors. If any Investment is reflected as being insured,<br>" +
                "<br>such insurance is being provided by a third-party insurance company and Validus shall not be responsible in the<br>" +
                "<br>event such insurance company is unable to or does not pay out in respect of any insurance claim.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createEightPageContent(PDPageContentStream cont, float width, PDType1Font font) throws IOException {

        Paragraph paragraph = new Paragraph();
  /*  String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String text = "(This publication has not been registered with any regulatory authority. Returns on any investment are not<br>" +
                "<br>guaranteed including the possible loss of the entire principal amount invested. Any grant of financing to the SME<br>" +
                "<br>remains subject to Validus’ internal approval notwithstanding that you may have submitted your Investment<br>" +
                "<br>Commitment. Please note that any graphs, charts, formulae or other devices set out or referred to in this<br>" +
                "<br>publication cannot, in and of itself, be used to determine and will not assist any person in deciding whether<br>" +
                "<br>and/or when to make an investment. Investors should note that the past performance of any investment,<br>" +
                "<br>company, entity or Validus mentioned in this publication, and any prediction, projection or forecast on the<br>" +
                "<br>economy, stock market, bond market or the economic trends of the markets is not necessarily indicative of the<br>" +
                "<br>future or likely performance of any investment, company, entity or Validus or the economy, stock market, bond<br>" +
                "<br>market or economic trends of the markets. Nothing in this publication shall constitute a representation or give<br>" +
                "<br>rise to any implication that there has not been or that there will not be any change affecting the<br>" +
                "<br>investment/financing. Employees of Validus shall not be held liable for any decision or action taken based on the<br>" +
                "<br>views expressed or information contained in this publication.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "( Investors should consider carefully the risks of investing and may wish to seek advice from a financial adviser<br>" +
                        "<br>before making a commitment to invest. Should you choose not to seek advice from a financial adviser, you<br>" +
                        "<br>should consider carefully whether the investment is suitable for you. For the avoidance of doubt, Validus owes<br>" +
                        "<br>no duty to you and is not acting in any capacity to provide you with advice in relation to any investment or<br>" +
                        "<br>financing.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

}
