import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

/**
 * @author hanbing
 * QQ红包样式邮件发送
 */
public class QQhongBao {
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
            email.addTo("3601340866@qq.com");
            email.setCharset("UTF-8");

            // 主题 - 模仿QQ红包通知风格
            email.setSubject("精神损失...");

            // QQ红包样式HTML
            email.setHtmlMsg(
                    "<div style='background:linear-gradient(180deg,#FF6B6B 0%,#EE5A6F 50%,#D32F2F 100%);padding:40px 16px;font-family:-apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif;min-height:100vh;'>" +

                            // 主容器 - 模仿红包卡片
                            "<div style='max-width:400px;margin:0 auto;background:#FFF8E7;border-radius:16px;overflow:hidden;box-shadow:0 8px 32px rgba(0,0,0,0.3);'>" +

                            // 顶部红色区域 - 红包头部
                            "<div style='background:linear-gradient(135deg,#FF5252 0%,#D32F2F 100%);padding:32px 24px;text-align:center;position:relative;'>" +

                            // 金色装饰线条
                            "<div style='position:absolute;top:0;left:0;right:0;height:4px;background:linear-gradient(90deg,transparent 0%,#FFD700 50%,transparent 100%);'></div>" +

                            // 红包图标/Logo区域
                            "<div style='width:64px;height:64px;background:linear-gradient(135deg,#FFD700 0%,#FFA000 100%);border-radius:50%;margin:0 auto 16px;display:flex;align-items:center;justify-content:center;box-shadow:0 4px 12px rgba(0,0,0,0.2);border:3px solid #FFF8E7;'>" +
                            "<span style='font-size:32px;'>🧧</span>" +
                            "</div>" +

                            // 发件人信息
                            "<div style='color:#FFF8E7;font-size:14px;opacity:0.9;margin-bottom:8px;'>来自：万果象棋</div>" +
                            "<div style='color:#FFFFFF;font-size:20px;font-weight:600;text-shadow:0 2px 4px rgba(0,0,0,0.2);'>给您发了一个精神损失...验证码</div>" +

                            // 金色装饰点
                            "<div style='margin-top:16px;display:flex;justify-content:center;gap:8px;'>" +
                            "<span style='width:6px;height:6px;background:#FFD700;border-radius:50%;'></span>" +
                            "<span style='width:6px;height:6px;background:#FFD700;border-radius:50%;'></span>" +
                            "<span style='width:6px;height:6px;background:#FFD700;border-radius:50%;'></span>" +
                            "</div>" +

                            "</div>" + // 结束顶部红色区域

                            // 中间内容区域 - 米黄色背景
                            "<div style='background:#FFF8E7;padding:32px 24px;text-align:center;'>" +

                            // 提示文字
                            "<div style='color:#8D6E63;font-size:14px;margin-bottom:16px;'>恭喜发财，大吉大利</div>" +

                            // 验证码展示区域 - 模仿红包金额样式
                            "<div style='background:#FFFFFF;border-radius:12px;padding:24px;margin:16px 0;box-shadow:0 2px 8px rgba(0,0,0,0.08);border:1px solid #FFE0B2;'>" +
                            "<div style='color:#757575;font-size:12px;margin-bottom:8px;'>查看验证码</div>" +
                            "<div style='font-size:36px;font-weight:700;color:#D32F2F;letter-spacing:4px;text-shadow:0 2px 4px rgba(211,47,47,0.1);'>" + code + "</div>" +
                            "</div>" +

                            // 有效期提示
                            "<div style='background:#FFEBEE;border-radius:8px;padding:12px;margin-top:16px;'>" +
                            "<div style='color:#C62828;font-size:13px;font-weight:500;'>⏰ 5分钟后过期</div>" +
                            "</div>" +

                            // 装饰分隔线
                            "<div style='margin:24px 0;display:flex;align-items:center;gap:12px;'>" +
                            "<div style='flex:1;height:1px;background:linear-gradient(90deg,transparent,#FFD700,transparent);'></div>" +
                            "<span style='color:#FFD700;font-size:12px;'>✦</span>" +
                            "<div style='flex:1;height:1px;background:linear-gradient(90deg,transparent,#FFD700,transparent);'></div>" +
                            "</div>" +

                            // 安全提示
                            "<div style='color:#8D6E63;font-size:12px;line-height:1.6;'>" +
                            "<div>如非本人操作，请忽略此邮件</div>" +
                            "<div style='margin-top:4px;opacity:0.8;'>万果象棋安全中心</div>" +
                            "</div>" +

                            "</div>" + // 结束内容区域

                            // 底部装饰
                            "<div style='background:#D32F2F;height:8px;background:linear-gradient(90deg,#FFD700 0%,#FFA000 50%,#FFD700 100%);'></div>" +

                            "</div>" + // 结束主容器

                            // 底部文字
                            "<div style='text-align:center;margin-top:24px;color:rgba(255,255,255,0.8);font-size:12px;'>" +
                            "<div>此邮件由万果象棋系统自动发送</div>" +
                            "</div>" +

                            "</div>"
            );

            // 当邮件客户端不支持HTML时显示的纯文本版本
            email.setTextMsg(
                    "【万果象棋】验证码红包\n\n" +
                            "您收到一个验证码红包：\n" +
                            "验证码：" + code + "\n" +
                            "有效期：5分钟\n\n" +
                            "如非本人操作，请忽略此邮件。"
            );

            // 发送邮件
            String result = email.send();
            System.out.println("🧧 红包邮件发送成功 ID: " + result);
        } catch (Exception e) {
            log.error("🧧 发送验证码红包邮件失败，收件人：{}", "3601340866@qq.com", e);
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