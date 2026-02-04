import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
/**
 * @author hanbing
 */
public class sendQQEmail {
    private static final String SAFE_CHARS = "23456789ABCDEFGHJKMNPQRSTUVWXYZ";
    private static final Logger log = LoggerFactory.getLogger(sendQQEmail.class);
    public static void main(String[] args) {
        String code = generateCode();
        try {
            // 创建HTML邮件对象
            HtmlEmail email = new HtmlEmail();

            // QQ SMTP服务器配置
            email.setHostName("smtp.qq.com");
            // SSL端口
            email.setSmtpPort(465);
            email.setSSLOnConnect(true);

            // 认证信息（替换成你的QQ邮箱和授权码）
            email.setAuthentication("3368894004@qq.com", "grczngaianzxcheg");

            // 发件人（必须和认证邮箱一致）
            email.setFrom("3368894004@qq.com", "万果象棋");

            // 收件人
            email.addTo("3368894004@qq.com");
            email.setCharset("UTF-8");
            // 主题和内容
            email.setSubject("【万果象棋】验证码通知");

            email.setHtmlMsg(
                    "<div style='max-width:420px;margin:0 auto;padding:32px;"
                            + "font-family:-apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif;"
                            + "color:#1d1d1f;'>" +

                            "<h1 style='font-size:22px;font-weight:600;margin:0 0 24px 0;'>万果象棋</h1>" +

                            "<p style='font-size:15px;line-height:1.6;margin:0 0 20px 0;'>"
                            + "您正在进行身份验证操作，验证码如下："
                            + "</p>" +

                            "<div style='font-size:32px;font-weight:600;letter-spacing:6px;"
                            + "text-align:center;margin:24px 0 32px 0;'>"
                            + code +
                            "</div>" +

                            "<p style='font-size:13px;color:#6e6e73;line-height:1.6;margin:0 0 16px 0;'>"
                            + "验证码将在 5 分钟后失效，请尽快完成验证。"
                            + "</p>" +

                            "<hr style='border:none;border-top:1px solid #e5e5e7;margin:24px 0;'/>" +

                            "<p style='font-size:12px;color:#86868b;line-height:1.5;margin:0;'>"
                            + "如非本人操作，请忽略本邮件。"
                            + "</p>" +

                            "</div>"
            );

            // 当邮件客户端不支持HTML时显示
            email.setTextMsg(
                    "【万果象棋】验证码通知\n\n" +
                    "您的验证码是：" + code + "\n" +
                            "验证码5分钟内有效，请尽快完成验证。\n\n" +
                            "如非本人操作，请忽略本邮件。"
            );

            // 发送邮件
            String result = email.send();
            System.out.println("邮件发送成功 ID: " + result);
        } catch (Exception e) {
            log.error("发送验证码邮件失败，收件人：{}", "3368894004@qq.com", e);
        }
    }
    public static String generateCode() {
        SecureRandom random = new SecureRandom();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(SAFE_CHARS.length());
            code.append(SAFE_CHARS.charAt(index));
        }
        return code.toString();
    }
}