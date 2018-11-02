<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xsd="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>

    <xsl:template match="/">
    <html>
        <body>
            <table>
            <xsl:apply-templates/>
            </table>
        </body>
    </html>
    </xsl:template>

    <xsl:template match="Member">
        <tr>
        <td> <xsl:value-of select="Name"/></td>
         <xsl:for-each select="Phone">
        <td> <xsl:value-of select="."/></td>
         </xsl:for-each>
        </tr>
    </xsl:template>

</xsl:stylesheet>