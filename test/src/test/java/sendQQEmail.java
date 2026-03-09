//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

public class sendQQEmail {
    private static final String SAFE_CHARS = "23456789ABCDEFGHJKMNPQRSTUVWXYZ";
    private static final Logger log = LoggerFactory.getLogger(sendQQEmail.class);

    public static void main(String[] args) {
        String code = generateCode();

        try {
            HtmlEmail email = new HtmlEmail();
            email.setHostName("smtp.qq.com");
            email.setSmtpPort(465);
            email.setSSLOnConnect(true);
            email.setAuthentication("3368894004@qq.com", "");
            email.setFrom("3368894004@qq.com", "万果象棋");
            email.addTo("3368894004@qq.com");
            email.setCharset("UTF-8");
            email.setSubject("【万果象棋】验证码通知");
            email.setHtmlMsg("<div style='background-color:#FCFCFC;padding:32px 16px;font-family:-apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif;'><div style='max-width:674px;margin:0 auto;'><div style='background-color:#FFFFFF;border:1px solid #e0e0e0;border-bottom:none;border-radius:12px 12px 0 0;padding:28px 32px 0;'><img src='https://img.cdn1.vip/i/6987557543f3f_1770476917.webp' width='80' height='80' style='border:0;display:block;' alt='万果象棋'><div style='height:16px;line-height:16px;'>&nbsp;</div></div><div style='background-color:#FFFFFF;border:1px solid #e0e0e0;border-top:none;border-radius:0 0 12px 12px;padding:0 40px 36px;'><div style='font-size:24px;font-weight:600;line-height:30px;color:#202020;padding-top:0;'>万果象棋</div><div style='height:16px;line-height:16px;'>&nbsp;</div><div style='font-size:16px;line-height:24px;color:#202020;'>您正在进行身份验证操作，验证码如下：</div><div style='height:24px;line-height:24px;'>&nbsp;</div><div style='font-size:28px;font-weight:400;letter-spacing:2px;line-height:30px;color:#202020;'>" + code + "</div><div style='height:32px;line-height:32px;'>&nbsp;</div><div style='border-top:1px solid #d9d9d9;height:1px;margin:0;'>&nbsp;</div><div style='height:32px;line-height:32px;'>&nbsp;</div><div style='font-size:12px;line-height:18px;color:#646464;'>验证码将在 5 分钟后失效，请尽快完成验证。</div><div style='height:12px;line-height:12px;'>&nbsp;</div><div style='font-size:12px;line-height:18px;color:#646464;'>如非本人操作，请忽略本邮件</div></div></div></div>");
            email.setTextMsg("【万果象棋】验证码通知\n\n您的验证码是：" + code + "\n验证码5分钟内有效，请尽快完成验证。\n\n如非本人操作，请忽略本邮件。");
            String result = email.send();
            System.out.println("邮件发送成功 ID: " + result);
        } catch (Exception e) {
            log.error("发送验证码邮件失败，收件人：{}", "3368894004@qq.com", e);
        }

    }

    public static String generateCode() {
        SecureRandom random = new SecureRandom();
        StringBuilder code = new StringBuilder();

        for(int i = 0; i < 6; ++i) {
            int index = random.nextInt("23456789ABCDEFGHJKMNPQRSTUVWXYZ".length());
            code.append("23456789ABCDEFGHJKMNPQRSTUVWXYZ".charAt(index));
        }

        return code.toString();
    }
}
