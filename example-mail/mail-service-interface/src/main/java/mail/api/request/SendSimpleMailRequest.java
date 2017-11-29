package mail.api.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jun
 */
@XmlRootElement(name = "send-simple-mail-request")
@XmlAccessorType(XmlAccessType.FIELD)
public class SendSimpleMailRequest {

    @XmlElement(name = "from")
    private String from;

    @XmlElement(name = "reply-to")
    private String replyTo;

    @XmlElement(name = "to")
    private String[] to;

    @XmlElement(name = "cc")
    private String[] cc;

    @XmlElement(name = "bcc")
    private String[] bcc;

    @XmlElement(name = "subject")
    private String subject;

    @XmlElement(name = "text")
    private String text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String... to) {
        this.to = to;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String... cc) {
        this.cc = cc;
    }

    public String[] getBcc() {
        return bcc;
    }

    public void setBcc(String[] bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
