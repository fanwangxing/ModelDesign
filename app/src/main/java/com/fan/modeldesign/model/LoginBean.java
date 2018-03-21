package com.fan.modeldesign.model;

/**
 * Created by fan on 2017/8/21.
 */

public class LoginBean {


    /**
     * result : {"accessToken":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjYwIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6ImFkbWluIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS9hY2Nlc3Njb250cm9sc2VydmljZS8yMDEwLzA3L2NsYWltcy9pZGVudGl0eXByb3ZpZGVyIjoiQVNQLk5FVCBJZGVudGl0eSIsIkFzcE5ldC5JZGVudGl0eS5TZWN1cml0eVN0YW1wIjoiOWMzZDU5MmQtMGZhZi00NWI2LTk3YzAtNjVhYjBlNmNhOTA5IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQWRtaW4iLCJodHRwOi8vd3d3LmFzcG5ldGJvaWxlcnBsYXRlLmNvbS9pZGVudGl0eS9jbGFpbXMvdGVuYW50SWQiOiIyMSIsInN1YiI6IjYwIiwianRpIjoiYjlkZmU3MzYtYzk0OC00NjBiLTkwZDgtNGI3MDhjMDFiZjNkIiwiaWF0IjoxNTAzMjk3MDk3LCJuYmYiOjE1MDMyOTcwOTcsImV4cCI6MTUwMzM4MzQ5NywiaXNzIjoiQWRtaW4iLCJhdWQiOiJBZG1pbiJ9.9uXXfS2_Y6-l_n3hw0ezzKNXUX2nX6a8m5qjRbNfJ5E","encryptedAccessToken":"HIINu1cszB7Ow78yl1ysFrluu7uhEg0nNOh5cZfQd60LiWSN7jSfQsgsADicwjf3wK4ZXyxuD/CxTosbw4wkCqbq5gCluT+wVNg8kLW8KstRue+zklxWH/gg+VnryGPuOLpDZHWzYwXWl99XMR+aeo6WAlWQvQSOapagJRcGJuj9HjdCRMT68Q7Uw0MGbeYxKTTKwodhAnQrv/uB8FXRMrunbuXEglQFhdTpcZnfeyQviVBl2qle7yldTwqnwNDkZF9AhlxdkjG03N02GDjmXfeG2cW8hHECHmry21YL7Qp7ym9qmdn7i0aAMhkPXeA/qB7z2r2yZJDrg2xDXeHX+jQDasaGocwKorY5dOcRwNu1sPUxR5WSN9w95pmuGh4cZgGLekKNRw96YJcDJSh7ekyDTfRCDO8sDsyAn6MQhOeasTZDEPA3jih40L+1UvjIHqQSAXL9gjaYKu7PxYi/5N5v9Jz3XdYl7Z0cIXvtS/SdJ5uPtWvpso878POYtj7P8vze2brhrk6KtjFgouRjeMojrkb9dUnd4cll2x1CmEsW+InAaY1BkWFukXs3BBep5vpWyImsfBEcmb2ng8md6A0NN/JXyh3s4a/36URJQIYL/QwGRKW5/4W+iyp1QJXbR5okZF+nm5z8qQo76YKJNKZLhkPsN3D2eraH1962Py+Hk78j1EWje3JVIp/RY2oi3fIyTl1gRStPmUKexuKk0I/r9ERYca4ro5hMa+3YlGW4b69qePl1Cg0Wxn0mFDBCrDHbhIlRIcoWGOGyyj99FgCCIMqBWmUoLhPmtgxq0oiahU3tg7rF90PMz06C7G6zHVweFoQagGAB5uVYUNag7O2OqTvPOx6vrz4jZ8eOyhgZxSb3OreAaRXcY8Xwf0jmj67ICh8VVcE8FvC83lfRlVguD4uf4NiB45B21p0krmqcpCKAFC0JUMcW3zkHNw5Ynh5tGs6Vq+PaliUYNytw/JbTm3avKFTcnHb/eg90xlcapmOINCRHhLVG9KCFet6d6jIBtbOrWSDcOUcZ19rOL5PH6kImhEMHOTdNgfo9Eh0/LjRK26WrQLyU07l3D0dfxGWBPGjjrdRi5E8kwdv/tjZ7fStuYlpXKNhhFylObs8s/CBKeeOBog09SWm41Pvh9vxdmwOIoCCjpgz0TxMTZA==","expireInSeconds":86400,"shouldResetPassword":false,"passwordResetCode":null,"userId":0,"requiresTwoFactorVerification":false,"twoFactorAuthProviders":null,"twoFactorRememberClientToken":null}
     * targetUrl : null
     * success : true
     * error : null
     * unAuthorizedRequest : false
     * __abp : true
     */

    private ResultBean result;
    private Object targetUrl;
    private boolean success;
    private Object error;
    private boolean unAuthorizedRequest;
    private boolean __abp;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public Object getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(Object targetUrl) {
        this.targetUrl = targetUrl;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public boolean isUnAuthorizedRequest() {
        return unAuthorizedRequest;
    }

    public void setUnAuthorizedRequest(boolean unAuthorizedRequest) {
        this.unAuthorizedRequest = unAuthorizedRequest;
    }

    public boolean is__abp() {
        return __abp;
    }

    public void set__abp(boolean __abp) {
        this.__abp = __abp;
    }

    public static class ResultBean {
        /**
         * accessToken : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjYwIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6ImFkbWluIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS9hY2Nlc3Njb250cm9sc2VydmljZS8yMDEwLzA3L2NsYWltcy9pZGVudGl0eXByb3ZpZGVyIjoiQVNQLk5FVCBJZGVudGl0eSIsIkFzcE5ldC5JZGVudGl0eS5TZWN1cml0eVN0YW1wIjoiOWMzZDU5MmQtMGZhZi00NWI2LTk3YzAtNjVhYjBlNmNhOTA5IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQWRtaW4iLCJodHRwOi8vd3d3LmFzcG5ldGJvaWxlcnBsYXRlLmNvbS9pZGVudGl0eS9jbGFpbXMvdGVuYW50SWQiOiIyMSIsInN1YiI6IjYwIiwianRpIjoiYjlkZmU3MzYtYzk0OC00NjBiLTkwZDgtNGI3MDhjMDFiZjNkIiwiaWF0IjoxNTAzMjk3MDk3LCJuYmYiOjE1MDMyOTcwOTcsImV4cCI6MTUwMzM4MzQ5NywiaXNzIjoiQWRtaW4iLCJhdWQiOiJBZG1pbiJ9.9uXXfS2_Y6-l_n3hw0ezzKNXUX2nX6a8m5qjRbNfJ5E
         * encryptedAccessToken : HIINu1cszB7Ow78yl1ysFrluu7uhEg0nNOh5cZfQd60LiWSN7jSfQsgsADicwjf3wK4ZXyxuD/CxTosbw4wkCqbq5gCluT+wVNg8kLW8KstRue+zklxWH/gg+VnryGPuOLpDZHWzYwXWl99XMR+aeo6WAlWQvQSOapagJRcGJuj9HjdCRMT68Q7Uw0MGbeYxKTTKwodhAnQrv/uB8FXRMrunbuXEglQFhdTpcZnfeyQviVBl2qle7yldTwqnwNDkZF9AhlxdkjG03N02GDjmXfeG2cW8hHECHmry21YL7Qp7ym9qmdn7i0aAMhkPXeA/qB7z2r2yZJDrg2xDXeHX+jQDasaGocwKorY5dOcRwNu1sPUxR5WSN9w95pmuGh4cZgGLekKNRw96YJcDJSh7ekyDTfRCDO8sDsyAn6MQhOeasTZDEPA3jih40L+1UvjIHqQSAXL9gjaYKu7PxYi/5N5v9Jz3XdYl7Z0cIXvtS/SdJ5uPtWvpso878POYtj7P8vze2brhrk6KtjFgouRjeMojrkb9dUnd4cll2x1CmEsW+InAaY1BkWFukXs3BBep5vpWyImsfBEcmb2ng8md6A0NN/JXyh3s4a/36URJQIYL/QwGRKW5/4W+iyp1QJXbR5okZF+nm5z8qQo76YKJNKZLhkPsN3D2eraH1962Py+Hk78j1EWje3JVIp/RY2oi3fIyTl1gRStPmUKexuKk0I/r9ERYca4ro5hMa+3YlGW4b69qePl1Cg0Wxn0mFDBCrDHbhIlRIcoWGOGyyj99FgCCIMqBWmUoLhPmtgxq0oiahU3tg7rF90PMz06C7G6zHVweFoQagGAB5uVYUNag7O2OqTvPOx6vrz4jZ8eOyhgZxSb3OreAaRXcY8Xwf0jmj67ICh8VVcE8FvC83lfRlVguD4uf4NiB45B21p0krmqcpCKAFC0JUMcW3zkHNw5Ynh5tGs6Vq+PaliUYNytw/JbTm3avKFTcnHb/eg90xlcapmOINCRHhLVG9KCFet6d6jIBtbOrWSDcOUcZ19rOL5PH6kImhEMHOTdNgfo9Eh0/LjRK26WrQLyU07l3D0dfxGWBPGjjrdRi5E8kwdv/tjZ7fStuYlpXKNhhFylObs8s/CBKeeOBog09SWm41Pvh9vxdmwOIoCCjpgz0TxMTZA==
         * expireInSeconds : 86400
         * shouldResetPassword : false
         * passwordResetCode : null
         * userId : 0
         * requiresTwoFactorVerification : false
         * twoFactorAuthProviders : null
         * twoFactorRememberClientToken : null
         */

        private String accessToken;
        private String encryptedAccessToken;
        private int expireInSeconds;
        private boolean shouldResetPassword;
        private Object passwordResetCode;
        private int userId;
        private boolean requiresTwoFactorVerification;
        private Object twoFactorAuthProviders;
        private Object twoFactorRememberClientToken;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getEncryptedAccessToken() {
            return encryptedAccessToken;
        }

        public void setEncryptedAccessToken(String encryptedAccessToken) {
            this.encryptedAccessToken = encryptedAccessToken;
        }

        public int getExpireInSeconds() {
            return expireInSeconds;
        }

        public void setExpireInSeconds(int expireInSeconds) {
            this.expireInSeconds = expireInSeconds;
        }

        public boolean isShouldResetPassword() {
            return shouldResetPassword;
        }

        public void setShouldResetPassword(boolean shouldResetPassword) {
            this.shouldResetPassword = shouldResetPassword;
        }

        public Object getPasswordResetCode() {
            return passwordResetCode;
        }

        public void setPasswordResetCode(Object passwordResetCode) {
            this.passwordResetCode = passwordResetCode;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public boolean isRequiresTwoFactorVerification() {
            return requiresTwoFactorVerification;
        }

        public void setRequiresTwoFactorVerification(boolean requiresTwoFactorVerification) {
            this.requiresTwoFactorVerification = requiresTwoFactorVerification;
        }

        public Object getTwoFactorAuthProviders() {
            return twoFactorAuthProviders;
        }

        public void setTwoFactorAuthProviders(Object twoFactorAuthProviders) {
            this.twoFactorAuthProviders = twoFactorAuthProviders;
        }

        public Object getTwoFactorRememberClientToken() {
            return twoFactorRememberClientToken;
        }

        public void setTwoFactorRememberClientToken(Object twoFactorRememberClientToken) {
            this.twoFactorRememberClientToken = twoFactorRememberClientToken;
        }
    }
}
