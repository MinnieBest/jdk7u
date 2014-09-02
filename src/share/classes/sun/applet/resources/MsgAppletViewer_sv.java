/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_sv extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] {
            {"textframe.button.dismiss", "St\u00E4ng"},
            {"appletviewer.tool.title", "Applet Viewer: {0}"},
            {"appletviewer.menu.applet", "Applet"},
            {"appletviewer.menuitem.restart", "Starta om"},
            {"appletviewer.menuitem.reload", "Ladda om"},
            {"appletviewer.menuitem.stop", "Stopp"},
            {"appletviewer.menuitem.save", "Spara..."},
            {"appletviewer.menuitem.start", "Starta"},
            {"appletviewer.menuitem.clone", "Klona..."},
            {"appletviewer.menuitem.tag", "Tagg..."},
            {"appletviewer.menuitem.info", "Information..."},
            {"appletviewer.menuitem.edit", "Redigera"},
            {"appletviewer.menuitem.encoding", "Teckenkodning"},
            {"appletviewer.menuitem.print", "Skriv ut..."},
            {"appletviewer.menuitem.props", "Egenskaper..."},
            {"appletviewer.menuitem.close", "St\u00E4ng"},
            {"appletviewer.menuitem.quit", "Avsluta"},
            {"appletviewer.label.hello", "Hej..."},
            {"appletviewer.status.start", "startar applet..."},
            {"appletviewer.appletsave.filedialogtitle","Serialisera applet till fil"},
            {"appletviewer.appletsave.err1", "serialiserar {0} till {1}"},
            {"appletviewer.appletsave.err2", "i appletSave: {0}"},
            {"appletviewer.applettag", "Tagg visas"},
            {"appletviewer.applettag.textframe", "HTML-tagg f\u00F6r applet"},
            {"appletviewer.appletinfo.applet", "-- ingen appletinformation --"},
            {"appletviewer.appletinfo.param", "-- ingen parameterinformation --"},
            {"appletviewer.appletinfo.textframe", "Appletinformation"},
            {"appletviewer.appletprint.fail", "Kunde inte skriva ut."},
            {"appletviewer.appletprint.finish", "Utskriften klar."},
            {"appletviewer.appletprint.cancel", "Utskriften avbruten."},
            {"appletviewer.appletencoding", "Teckenkodning: {0}"},
            {"appletviewer.parse.warning.requiresname", "Varning: <param name=... value=...>-taggen kr\u00E4ver ett namnattribut."},
            {"appletviewer.parse.warning.paramoutside", "Varning: <param>-taggen finns utanf\u00F6r <applet> ... </applet>."},
            {"appletviewer.parse.warning.applet.requirescode", "Varning: <applet>-taggen kr\u00E4ver ett kodattribut."},
            {"appletviewer.parse.warning.applet.requiresheight", "Varning: <applet>-taggen kr\u00E4ver ett h\u00F6jdattribut."},
            {"appletviewer.parse.warning.applet.requireswidth", "Varning: <applet>-taggen kr\u00E4ver ett breddattribut."},
            {"appletviewer.parse.warning.object.requirescode", "Varning: <object>-taggen kr\u00E4ver ett kodattribut."},
            {"appletviewer.parse.warning.object.requiresheight", "Varning: <object>-taggen kr\u00E4ver ett h\u00F6jdattribut."},
            {"appletviewer.parse.warning.object.requireswidth", "Varning: <object>-taggen kr\u00E4ver ett breddattribut."},
            {"appletviewer.parse.warning.embed.requirescode", "Varning: <embed>-taggen kr\u00E4ver ett kodattribut."},
            {"appletviewer.parse.warning.embed.requiresheight", "Varning: <embed>-taggen kr\u00E4ver ett h\u00F6jdattribut."},
            {"appletviewer.parse.warning.embed.requireswidth", "Varning: <embed>-taggen kr\u00E4ver ett breddattribut."},
            {"appletviewer.parse.warning.appnotLongersupported", "Varning: <app>-taggen st\u00F6ds inte l\u00E4ngre, anv\u00E4nd <applet> ist\u00E4llet:"},
            {"appletviewer.usage", "Syntax: appletviewer-<alternativ> url:er \n\nd\u00E4r <alternativ> inkluderar:\n  -debug                  Startar appletvisning i Java-fels\u00F6kningen\n  -encoding <kodning>    Anger teckenkodning  som anv\u00E4nds i HTML-filer\n  -J<k\u00F6rningsflagga>        \u00D6verf\u00F6r argument till Java-tolkningen\n\nAlternativet -J \u00E4r inte standard och kan \u00E4ndras utan f\u00F6reg\u00E5ende meddelande."},
            {"appletviewer.main.err.unsupportedopt", "Alternativ som inte st\u00F6ds: {0}"},
            {"appletviewer.main.err.unrecognizedarg", "Ok\u00E4nt argument: {0}"},
            {"appletviewer.main.err.dupoption", "Duplicerat alternativ: {0}"},
            {"appletviewer.main.err.inputfile", "Inga angivna indatafiler."},
            {"appletviewer.main.err.badurl", "Felaktig URL: {0} ( {1} )"},
            {"appletviewer.main.err.io", "I/O-undantag vid l\u00E4sning: {0}"},
            {"appletviewer.main.err.readablefile", "Kontrollera att {0} \u00E4r en fil som \u00E4r l\u00E4sbar."},
            {"appletviewer.main.err.correcturl", "\u00C4r {0} den korrekta URL:en?"},
            {"appletviewer.main.prop.store", "Anv\u00E4ndarspecifika egenskaper f\u00F6r AppletViewer"},
            {"appletviewer.main.err.prop.cantread", "Kan inte l\u00E4sa egenskapsfilen: {0}"},
            {"appletviewer.main.err.prop.cantsave", "Kan inte spara egenskapsfilen: {0}"},
            {"appletviewer.main.warn.nosecmgr", "Varning! S\u00E4kerheten avaktiveras."},
            {"appletviewer.main.debug.cantfinddebug", "Hittar inte fels\u00F6kningsprogrammet!"},
            {"appletviewer.main.debug.cantfindmain", "Hittar inte huvudmetoden i fels\u00F6kningsprogrammet!"},
            {"appletviewer.main.debug.exceptionindebug", "Undantag i fels\u00F6kningsprogrammet!"},
            {"appletviewer.main.debug.cantaccess", "Det finns ingen \u00E5tkomst till fels\u00F6kningsprogrammet!"},
            {"appletviewer.main.nosecmgr", "Varning: SecurityManager har inte installerats!"},
            {"appletviewer.main.warning", "Varning: Inga appletar har startats. Kontrollera att indata inneh\u00E5ller <applet>-tagg."},
            {"appletviewer.main.warn.prop.overwrite", "Varning: Skriver tillf\u00E4lligt \u00F6ver systemegenskap enligt beg\u00E4ran fr\u00E5n anv\u00E4ndare: nyckel: {0} gammalt v\u00E4rde: {1} nytt v\u00E4rde: {2}"},
            {"appletviewer.main.warn.cantreadprops", "Varning: Kan inte l\u00E4sa egenskapsfil f\u00F6r AppletViewer: {0} Standardv\u00E4rden anv\u00E4nds."},
            {"appletioexception.loadclass.throw.interrupted", "klassinl\u00E4sning avbr\u00F6ts: {0}"},
            {"appletioexception.loadclass.throw.notloaded", "klass inte inl\u00E4st: {0}"},
            {"appletclassloader.loadcode.verbose", "\u00D6ppnar str\u00F6m till: {0} f\u00F6r h\u00E4mtning av {1}"},
            {"appletclassloader.filenotfound", "Hittade inte fil vid s\u00F6kning efter: {0}"},
            {"appletclassloader.fileformat", "Undantag av filformat vid laddning av: {0}"},
            {"appletclassloader.fileioexception", "I/O-undantag vid laddning: {0}"},
            {"appletclassloader.fileexception", "{0} undantag vid laddning: {1}"},
            {"appletclassloader.filedeath", "{0} avslutad vid laddning: {1}"},
            {"appletclassloader.fileerror", "{0} fel vid laddning: {1}"},
            {"appletclassloader.findclass.verbose.openstream", "\u00D6ppnar str\u00F6m till: {0} f\u00F6r h\u00E4mtning av {1}"},
            {"appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource f\u00F6r namnet: {0}"},
            {"appletclassloader.getresource.verbose.found", "Hittade resursen: {0} som systemresurs"},
            {"appletclassloader.getresourceasstream.verbose", "Hittade resursen: {0} som systemresurs"},
            {"appletpanel.runloader.err", "Antingen objekt- eller kodparameter!"},
            {"appletpanel.runloader.exception", "undantag vid avserialisering {0}"},
            {"appletpanel.destroyed", "Applet raderad."},
            {"appletpanel.loaded", "Applet laddad."},
            {"appletpanel.started", "Applet startad."},
            {"appletpanel.inited", "Applet initierad."},
            {"appletpanel.stopped", "Applet stoppad."},
            {"appletpanel.disposed", "Applet kasserad."},
            {"appletpanel.nocode", "APPLET-tagg saknar CODE-parameter."},
            {"appletpanel.notfound", "load: hittade inte klassen {0}."},
            {"appletpanel.nocreate", "load: {0} kan inte instansieras."},
            {"appletpanel.noconstruct", "load: {0} \u00E4r inte allm\u00E4n eller saknar allm\u00E4n konstruktor."},
            {"appletpanel.death", "avslutad"},
            {"appletpanel.exception", "undantag: {0}."},
            {"appletpanel.exception2", "undantag: {0}: {1}."},
            {"appletpanel.error", "fel: {0}."},
            {"appletpanel.error2", "fel {0}: {1}."},
            {"appletpanel.notloaded", "Initiera: applet \u00E4r inte inl\u00E4st."},
            {"appletpanel.notinited", "Starta: applet \u00E4r inte initierad."},
            {"appletpanel.notstarted", "Stoppa: applet har inte startats."},
            {"appletpanel.notstopped", "Radera: applet har inte stoppats."},
            {"appletpanel.notdestroyed", "Kassera: applet har inte raderats."},
            {"appletpanel.notdisposed", "Ladda: applet har inte kasserats."},
            {"appletpanel.bail", "Avbruten."},
            {"appletpanel.filenotfound", "Hittade inte fil vid s\u00F6kning efter: {0}"},
            {"appletpanel.fileformat", "Undantag av filformat vid laddning av: {0}"},
            {"appletpanel.fileioexception", "I/O-undantag vid laddning: {0}"},
            {"appletpanel.fileexception", "{0} undantag vid laddning: {1}"},
            {"appletpanel.filedeath", "{0} avslutad vid laddning: {1}"},
            {"appletpanel.fileerror", "{0} fel vid laddning: {1}"},
            {"appletpanel.badattribute.exception", "HTML-tolkning: felaktigt v\u00E4rde f\u00F6r bredd-/h\u00F6jdattribut"},
            {"appletillegalargumentexception.objectinputstream", "AppletObjectInputStream kr\u00E4ver laddare med icke-null"},
            {"appletprops.title", "AppletViewer-egenskaper"},
            {"appletprops.label.http.server", "HTTP-proxyserver:"},
            {"appletprops.label.http.proxy", "HTTP-proxyport:"},
            {"appletprops.label.network", "N\u00E4tverks\u00E5tkomst:"},
            {"appletprops.choice.network.item.none", "Ingen"},
            {"appletprops.choice.network.item.applethost", "Appletv\u00E4rd"},
            {"appletprops.choice.network.item.unrestricted", "Obegr\u00E4nsad"},
            {"appletprops.label.class", "Klass\u00E5tkomst:"},
            {"appletprops.choice.class.item.restricted", "Begr\u00E4nsad"},
            {"appletprops.choice.class.item.unrestricted", "Obegr\u00E4nsad"},
            {"appletprops.label.unsignedapplet", "Till\u00E5t osignerade appletar:"},
            {"appletprops.choice.unsignedapplet.no", "Nej"},
            {"appletprops.choice.unsignedapplet.yes", "Ja"},
            {"appletprops.button.apply", "Anv\u00E4nd"},
            {"appletprops.button.cancel", "Avbryt"},
            {"appletprops.button.reset", "\u00C5terst\u00E4ll"},
            {"appletprops.apply.exception", "Kunde inte spara egenskaper: {0}"},
            /* 4066432 */
            {"appletprops.title.invalidproxy", "Ogiltig post"},
            {"appletprops.label.invalidproxy", "Proxyport m\u00E5ste vara ett positivt heltal."},
            {"appletprops.button.ok", "OK"},
            /* end 4066432 */
            {"appletprops.prop.store", "Anv\u00E4ndarspecifika egenskaper f\u00F6r AppletViewer"},
            {"appletsecurityexception.checkcreateclassloader", "S\u00E4kerhetsundantag: klassladdare"},
            {"appletsecurityexception.checkaccess.thread", "S\u00E4kerhetsundantag: tr\u00E5d"},
            {"appletsecurityexception.checkaccess.threadgroup", "S\u00E4kerhetsundantag: tr\u00E5dgrupp: {0}"},
            {"appletsecurityexception.checkexit", "S\u00E4kerhetsundantag: utg\u00E5ng: {0}"},
            {"appletsecurityexception.checkexec", "S\u00E4kerhetsundantag: exec: {0}"},
            {"appletsecurityexception.checklink", "S\u00E4kerhetsundantag: l\u00E4nk: {0}"},
            {"appletsecurityexception.checkpropsaccess", "S\u00E4kerhetsundantag: egenskaper"},
            {"appletsecurityexception.checkpropsaccess.key", "S\u00E4kerhetsundantag: egenskaps\u00E5tkomst {0}"},
            {"appletsecurityexception.checkread.exception1", "S\u00E4kerhetsundantag: {0}, {1}"},
            {"appletsecurityexception.checkread.exception2", "S\u00E4kerhetsundantag: file.read: {0}"},
            {"appletsecurityexception.checkread", "S\u00E4kerhetsundantag: file.read: {0} == {1}"},
            {"appletsecurityexception.checkwrite.exception", "S\u00E4kerhetsundantag: {0}, {1}"},
            {"appletsecurityexception.checkwrite", "S\u00E4kerhetsundantag: file.write: {0} == {1}"},
            {"appletsecurityexception.checkread.fd", "S\u00E4kerhetsundantag: fd.read"},
            {"appletsecurityexception.checkwrite.fd", "S\u00E4kerhetsundantag: fd.write"},
            {"appletsecurityexception.checklisten", "S\u00E4kerhetsundantag: socket.listen: {0}"},
            {"appletsecurityexception.checkaccept", "S\u00E4kerhetsundantag: socket.accept: {0}:{1}"},
            {"appletsecurityexception.checkconnect.networknone", "S\u00E4kerhetsundantag: socket.connect: {0}->{1}"},
            {"appletsecurityexception.checkconnect.networkhost1", "S\u00E4kerhetsundantag: Kunde inte ansluta till {0} med ursprung fr\u00E5n {1}."},
            {"appletsecurityexception.checkconnect.networkhost2", "S\u00E4kerhetsundantag: Kunde inte matcha IP f\u00F6r v\u00E4rd {0} eller f\u00F6r {1}. "},
            {"appletsecurityexception.checkconnect.networkhost3", "S\u00E4kerhetsundantag: Kunde inte matcha IP f\u00F6r v\u00E4rd {0}. Se egenskapen trustProxy."},
            {"appletsecurityexception.checkconnect", "S\u00E4kerhetsundantag: connect: {0}->{1}"},
            {"appletsecurityexception.checkpackageaccess", "S\u00E4kerhetsundantag: ingen \u00E5tkomst till paket: {0}"},
            {"appletsecurityexception.checkpackagedefinition", "S\u00E4kerhetsundantag: kan inte definiera paket: {0}"},
            {"appletsecurityexception.cannotsetfactory", "S\u00E4kerhetsundantag: kan inte ange fabrik"},
            {"appletsecurityexception.checkmemberaccess", "S\u00E4kerhetsundantag: kontrollera medlems\u00E5tkomst"},
            {"appletsecurityexception.checkgetprintjob", "S\u00E4kerhetsundantag: getPrintJob"},
            {"appletsecurityexception.checksystemclipboardaccess", "S\u00E4kerhetsundantag: getSystemClipboard"},
            {"appletsecurityexception.checkawteventqueueaccess", "S\u00E4kerhetsundantag: getEventQueue"},
            {"appletsecurityexception.checksecurityaccess", "S\u00E4kerhetsundantag: s\u00E4kerhets\u00E5tg\u00E4rd: {0}"},
            {"appletsecurityexception.getsecuritycontext.unknown", "ok\u00E4nd typ av klassladdare. kan inte kontrollera getContext"},
            {"appletsecurityexception.checkread.unknown", "ok\u00E4nd typ av klassladdare. kan inte kontrollera kontroll\u00E4sning {0}"},
            {"appletsecurityexception.checkconnect.unknown", "ok\u00E4nd typ av klassladdare. kan inte kontrollera kontrollanslutning"},
        };

        return temp;
    }
}
